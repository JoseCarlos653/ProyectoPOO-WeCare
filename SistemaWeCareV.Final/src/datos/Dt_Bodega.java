/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Bodega;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Maria Regina
 */
public class Dt_Bodega {
    
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
            ps = con.prepareStatement("SELECT bodegaID,wecareID,nombreBodega,descripcion,estado FROM Bodega", //EDIT
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Bodega> listarBodega(){
        ArrayList<Bodega> listBodega = new ArrayList<Bodega>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Bodega b = new Bodega();
                b.setBodegaID(rs.getInt("bodegaID"));
                b.setWecareID(rs.getInt("wecareID"));                
                b.setNombreBodega(rs.getString("nombreBodega"));
                b.setDescripcion(rs.getString("descripcion"));
                b.setEstado(rs.getInt("estado"));

                listBodega.add(b);//EDIT
            }
        }catch(SQLException e){
            System.out.println("Error en listarBodega(): "+e.getMessage());
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
         return listBodega;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarBodega (Bodega b)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("bodegaID", b.getBodegaID());
            rs.updateInt("wecareID", b.getWecareID());
            rs.updateString("nombreBodega", b.getNombreBodega()); 
            rs.updateString("descripcion", b.getDescripcion());
            rs.updateInt("estado", b.getEstado()); 
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarBodega(): "+e.getMessage());
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
    public boolean existeBodega(Bodega b){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("nombreBodega").equals(b.getNombreBodega())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeBodega(): "+e.getMessage());
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
    public boolean editarBodega(Bodega b)//EDITAR
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("bodegaID")==b.getBodegaID()){
                    rs.updateInt("wecareID", b.getWecareID());// 
                    rs.updateString("nombrebodega", b.getNombreBodega());
                    rs.updateString("descripcion", b.getDescripcion());
                    rs.updateInt("estado", b.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarBodega(): "+e.getMessage());
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
    public boolean deleteBodega(Bodega b){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("bodegaID")==b.getBodegaID()){ 
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteBodega(): "+e.getMessage());
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

    

