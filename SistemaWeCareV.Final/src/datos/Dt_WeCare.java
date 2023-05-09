/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import entidades.WeCare;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JoseCarlos
 */
public class Dt_WeCare {
    //Atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //Métodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT wecareID, nombreNegocio, fechaFundacion, correo, telefono, correoOwner, telefonoOwner FROM Wecare", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<WeCare> listarWeCare(){
        ArrayList<WeCare> listaWeCare = new ArrayList<WeCare>();
        try{
            this.cargarDatos();
            while(rs.next()){
                WeCare wc = new WeCare();
                
                wc.setWecareID(rs.getInt("wecareID"));
                wc.setNombreNegocio(rs.getString("nombreNegocio"));
                wc.setFechaFundacion(rs.getString("fechaFundacion"));
                wc.setCorreo(rs.getString("correo"));
                wc.setTelefono(rs.getString("telefono"));
                wc.setCorreoOwner(rs.getString("correoOwner"));
                wc.setTelefonoOwner(rs.getString("telefonoOwner"));
                listaWeCare.add(wc);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarWeCare(): "+e.getMessage());
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
        
        
        return listaWeCare;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarWeCare (WeCare wecare)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //(nombre de la columna en sql, el atributo de la entidad)
            //rs.updateInt("wecareID", wecare.getWecareID()); // El campo en la tabla es autoincremental
            rs.updateString("nombreNegocio", wecare.getNombreNegocio());
            rs.updateString("fechaFundacion", wecare.getFechaFundacion());
            rs.updateString("correo", wecare.getCorreo());
            rs.updateString("telefono", wecare.getTelefono());
            rs.updateString("correoOwner", wecare.getCorreoOwner());
            rs.updateString("telefonoOwner", wecare.getTelefonoOwner());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarWeCare(): "+e.getMessage());
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
    public boolean editarWeCare(WeCare wecare)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("wecareID")== wecare.getWecareID()){
                    rs.updateString("nombreNegocio", wecare.getNombreNegocio());
                    rs.updateString("fechaFundacion", wecare.getFechaFundacion());
                    rs.updateString("correo", wecare.getCorreo());
                    rs.updateString("telefono", wecare.getTelefono());
                    rs.updateString("correoOwner", wecare.getCorreoOwner());
                    rs.updateString("telefonoOwner", wecare.getTelefonoOwner());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarWeCare(): "+e.getMessage());
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

}
