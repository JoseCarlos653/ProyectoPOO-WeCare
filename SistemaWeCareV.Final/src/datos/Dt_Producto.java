package datos;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luswi Torres
 */
public class Dt_Producto {
    
    // Atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    
    // Metodos
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT productoID, tipoproductoID, nombreProducto, precio, marca, descripcion, fechaIngreso, fechaVencimiento, estado FROM Producto", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Producto> listarProd(){
        ArrayList<Producto> listProd = new ArrayList<Producto>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Producto p = new Producto();
                p.setProductoID(rs.getInt("productoID"));
                p.setTipoproductoID(rs.getInt("tipoproductoID"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setPrecio(rs.getFloat("precio"));
                p.setMarca(rs.getString("marca"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechaIngreso(rs.getString("fechaIngreso"));
                p.setFechaVencimiento(rs.getString("fechaVencimiento"));
                p.setEstado(rs.getInt("estado"));
                listProd.add(p);
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
         return listProd;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarProd (Producto prod)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //(nombre de la columna en sql, el atributo de la entidad)
            //rs.updateInt("department_id", dep.getDepartment_id());// el campo en la tabla es autoincremental
            rs.updateInt("tipoproductoID", prod.getTipoproductoID());
            rs.updateString("nombreProducto", prod.getNombreProducto());
            rs.updateFloat("precio", prod.getPrecio());
            rs.updateString("marca", prod.getMarca());
            rs.updateString("descripcion", prod.getDescripcion());
            rs.updateString("fechaIngreso", prod.getFechaIngreso());
            rs.updateString("fechaVencimiento", prod.getFechaVencimiento());
            rs.updateInt("estado", prod.getEstado());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarProd(): "+e.getMessage());
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
    public boolean existeProd(Producto prod){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("nombreProducto").equals(prod.getNombreProducto())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeProd(): "+e.getMessage());
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
    public boolean editarProd(Producto prod)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("productoID") == (prod.getProductoID())){
                    rs.updateInt("tipoproductoID", prod.getTipoproductoID());
                    rs.updateString("nombreProducto", prod.getNombreProducto());
                    rs.updateFloat("precio", prod.getPrecio());
                    rs.updateString("marca", prod.getMarca());
                    rs.updateString("descripcion", prod.getDescripcion());
                    rs.updateString("fechaIngreso", prod.getFechaIngreso());
                    rs.updateString("fechaVencimiento", prod.getFechaVencimiento());
                    rs.updateInt("estado", prod.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarProd(): "+e.getMessage());
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
    public boolean deleteProd(Producto prod){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("productoID") == (prod.getProductoID())){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteProd(): "+e.getMessage());
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
