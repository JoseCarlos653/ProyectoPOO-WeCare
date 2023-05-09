/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Maria Regina
 */
public class Dt_Inventario {
    
    //atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    //metodos
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT inventarioID, bodegaID, productoID, cantidadInicial, fecha, movimientosPositivos, movimientosNegativos, numerosDocumento, saldoFinal FROM Inventario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Inventario> listarInventario(){
        ArrayList<Inventario> listInventario = new ArrayList<Inventario>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Inventario inv = new Inventario();
                inv.setInventarioID(rs.getInt("inventarioID"));
                inv.setBodegaID(rs.getInt("bodegaID"));
                inv.setProductoID(rs.getInt("ProductoID"));         
                inv.setCantidadInicial(rs.getInt("cantidadInicial"));               
                inv.setFecha(rs.getString("fecha"));
                inv.setMovimientosPositivos(rs.getInt("movimientosPositivos"));
                inv.setMovimientosNegativos(rs.getInt("movimientosNegativos")); 
                inv.setNumerosDocumento(rs.getString("numerosDocumento"));
                inv.setSaldoFinal(rs.getInt("saldoFinal"));
                listInventario.add(inv);
            }
        }catch(SQLException e){
            System.out.println("Error en listarInventario(): "+e.getMessage());
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
         return listInventario;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarInventario (Inventario inv)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("inventarioID", inv.getInventarioID());
            rs.updateInt("bodegaID", inv.getBodegaID());
            rs.updateInt("productoID", inv.getProductoID());            
            rs.updateInt("cantidadInicial", inv.getCantidadInicial());
            rs.updateString("fecha", inv.getFecha());
            rs.updateInt("movimientosPositivos", inv.getMovimientosPositivos());
            rs.updateInt("movimientosNegativos", inv.getMovimientosNegativos());
            rs.updateString("numerosDocumento", inv.getNumerosDocumento());
            rs.updateInt("saldoFinal", inv.getSaldoFinal());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarInventario(): "+e.getMessage());
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
    public boolean existeInventario( Inventario inv){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("inventarioID")==inv.getInventarioID()){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeInventario(): "+e.getMessage());
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
    public boolean editarInventario(Inventario inv)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("inventarioID")==inv.getInventarioID()){
                    rs.updateInt("bodegaID", inv.getBodegaID());
                    rs.updateInt("productoID", inv.getProductoID());
                    rs.updateInt("cantidadInicial", inv.getCantidadInicial());
                    rs.updateString("fecha", inv.getFecha());
                    rs.updateInt("movimientosPositivos", inv.getMovimientosPositivos());
                    rs.updateInt("movimientosNegativos", inv.getMovimientosNegativos());
                    rs.updateString("numerosDocumento", inv.getNumerosDocumento());
                    rs.updateInt("saldoFinal", inv.getSaldoFinal());
                    
                    
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarInventario(): "+e.getMessage());
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
    public boolean deleteInventario(Inventario inv){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("inventarioID") == (inv.getInventarioID())){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteInventario(): "+e.getMessage());
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
