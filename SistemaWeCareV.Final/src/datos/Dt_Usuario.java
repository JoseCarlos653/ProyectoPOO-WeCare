package datos;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luswi Torres
 */
public class Dt_Usuario {
    
    // Atributos
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    // Metodos
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT usuarioID, rolID, nombreUsuario , clave, estado FROM Usuario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUsuarioID(rs.getInt("usuarioID"));
                u.setRolID(rs.getInt("rolID"));
                u.setNombreUsuario(rs.getString("nombreUsuario"));
                u.setClave(rs.getString("clave"));
                u.setEstado(rs.getInt("estado"));
                listUsuario.add(u);
            }
        }catch(SQLException e){
            System.out.println("Error en listarUsuario(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
         return listUsuario;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean validarUsuario(String user, String pwd){
	boolean acceso=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("nombreUsuario").equals(user) && rs.getString("clave").equals(pwd)){
                    acceso=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error validarUsuario(): "+e.getMessage());
            e.printStackTrace();
	}
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
		
        return acceso;
    }
    
    
    public Usuario getUsuario(String user){
        Usuario u = new Usuario();
        try{
            this.cargarDatos();
            while(rs.next()){
                if(rs.getString("nombreUsuario").equals(user)){
                    u.setUsuarioID(rs.getInt("usuarioID"));
                    u.setRolID(rs.getInt("rolID"));
                    u.setNombreUsuario(rs.getString("nombreUsuario"));
                    u.setClave(rs.getString("clave"));
                    u.setEstado(rs.getInt("estado"));
                    break;
                }
                
            }     
        }catch(SQLException e){
            System.out.println("El error en getLocationByID(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }  
        }
        
        
        return u;      
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarUsuario (Usuario u)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateInt("rolID", u.getRolID());
            rs.updateString("nombreUsuario", u.getNombreUsuario());
            rs.updateString("clave", u.getClave());
            rs.updateInt("estado", u.getEstado());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarUsuario(): "+e.getMessage());
            e.printStackTrace();
	}
	finally
	{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
	}
        //returnamos el valor de la bandera
	return guardado;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean existeUsuario(Usuario u){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("nombreUsuario").equals(u.getNombreUsuario())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeUsuario(): "+e.getMessage());
            e.printStackTrace();
	}
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
		
        return resp;
    }

    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarUsuario(Usuario u)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("usuarioID") == (u.getUsuarioID())){
                    rs.updateInt("rolID", u.getRolID());
                    rs.updateString("nombreUsuario", u.getNombreUsuario());
                    rs.updateString("clave", u.getClave());
                    rs.updateInt("estado", u.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarUsuario(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                    if(rs!=null){
                    rs.close();
                    }
                    if(ps!=null){
                        ps.close();
                    }
                    if(con!=null){
                        Conexion.closeConexion(con);
                    }
            }catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
        }
        return resp;
    } 
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean deleteUsuario(Usuario u){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("usuarioID") == (u.getUsuarioID())){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteUsuario(): "+e.getMessage());
            e.printStackTrace();
	}
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
		
        return resp;
    }
}
