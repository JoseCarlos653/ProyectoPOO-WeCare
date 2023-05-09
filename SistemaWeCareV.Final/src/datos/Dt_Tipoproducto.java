package datos;
import entidades.Tipoproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luswi Torres
 */
public class Dt_Tipoproducto {
    
    // Atributos
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT tipoproductoID, nombreTipoProducto, descripcion, estado FROM Tipoproducto", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    
     @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Tipoproducto> listarTipoproducto(){
        ArrayList<Tipoproducto> listTipoProd = new ArrayList<Tipoproducto>();
        try {
            this.cargarDatos();
            while(rs.next()){
                Tipoproducto tp = new Tipoproducto();
                tp.setTipoproductoID(rs.getInt("tipoproductoID"));
                tp.setNombreTipoProducto(rs.getString("nombreTipoProducto"));
                tp.setDescripcion(rs.getString("descripcion"));
                tp.setEstado(rs.getInt("estado"));
                listTipoProd.add(tp);
            }
        } catch(SQLException e){
            System.out.println("Error en listarTipoproducto(): "+e.getMessage());
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
         return listTipoProd;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarTipoproducto (Tipoproducto tprod)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateString("nombreTipoProducto", tprod.getNombreTipoProducto());
            rs.updateString("descripcion", tprod.getDescripcion());
            rs.updateInt("estado", tprod.getEstado());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarTipoproducto(): "+e.getMessage());
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
    public boolean existeTipoproducto(Tipoproducto tprod){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("tipoproductoID") == (tprod.getTipoproductoID())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeTipoproducto(): "+e.getMessage());
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
    public boolean editarTipoproducto(Tipoproducto tprod)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("tipoproductoID") == (tprod.getTipoproductoID())){
                    rs.updateString("nombreTipoProducto", tprod.getNombreTipoProducto());
                    rs.updateString("descripcion", tprod.getDescripcion());
                    rs.updateInt("estado", tprod.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarTipoproducto(): "+e.getMessage());
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
    public boolean deleteTipoproducto(Tipoproducto tprod){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("tipoproductoID") == (tprod.getTipoproductoID())){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteTipoproducto(): "+e.getMessage());
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
