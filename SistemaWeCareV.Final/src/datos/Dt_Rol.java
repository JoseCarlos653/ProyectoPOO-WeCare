package datos;
import entidades.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luswi Torres
 */

public class Dt_Rol {
    
    // Atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    
    // Metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT rolID, rolNombre, estado FROM Rol", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public Rol getRolByID(int rol_id){
        Rol r = new Rol();
        try{
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("rolID") == rol_id){
                    r.setRolID(rol_id);
                    r.setRolNombre(rs.getString("rolNombre"));
                    r.setEstado(rs.getInt("estado"));
                    
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
         
        return r;      
    }
    
    
     @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Rol> listarRol(){
        ArrayList<Rol> listRol = new ArrayList<Rol>();
        try {
            this.cargarDatos();
            while(rs.next()){
                Rol r = new Rol();
                r.setRolID(rs.getInt("rolID"));
                r.setRolNombre(rs.getString("rolNombre"));
                r.setEstado(rs.getInt("estado"));
                listRol.add(r);
            }
        } catch(SQLException e){
            System.out.println("Error en listarRol(): "+e.getMessage());
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
         return listRol;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarRol (Rol r)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateString("rolNombre", r.getRolNombre());
            rs.updateInt("estado", r.getEstado());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarRol(): "+e.getMessage());
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
    public boolean existeRol(int id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("rolID") == (id)){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeRol(): "+e.getMessage());
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
    public boolean editarRol(Rol r)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("rolID") == (r.getRolID())){
                    rs.updateString("nombreRol", r.getRolNombre());
                    rs.updateInt("estado", r.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarRol(): "+e.getMessage());
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
    public boolean deleteRol(int id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("rolID") == (id)){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteRol(): "+e.getMessage());
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
