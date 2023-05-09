/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Expediente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Leite
 */
public class Dt_Expediente {
    
     //Atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    //Metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT expedienteID, mascotaID, numeroExpediente, fechaRegistro, tipoSangre, castrado, estado FROM Expediente", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Expediente> listarExpediente(){
        ArrayList<Expediente> listaExpediente = new ArrayList<Expediente>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Expediente d = new Expediente();
                d.setExpedienteID(rs.getInt("expedienteID"));
                d.setMascotaID(rs.getInt("mascotaID"));
                d.setNumeroExpediente(rs.getInt("numeroExpediente"));
                d.setFechaRegistro(rs.getString("fechaRegistro"));
                d.setTipoSangre(rs.getString("tipoSangre"));
                d.setCastrado(rs.getInt("castrado"));
                d.setEstado(rs.getInt("estado"));
                listaExpediente.add(d);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarExpediente(): "+e.getMessage());
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
        
        
        return listaExpediente;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean existeExpediente(Expediente ex){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("mascotaID").equals(ex.getMascotaID())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeMascota(): "+e.getMessage());
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
    public boolean guardarExpediente (Expediente ex)
    {
        // Declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("expedienteID", ex.getExpedienteID());
            rs.updateInt("mascotaID", ex.getMascotaID());
            rs.updateInt("numeroExpediente", ex.getNumeroExpediente());
            rs.updateString("fechaRegistro", ex.getFechaRegistro());
            rs.updateString("tipoSangre", ex.getTipoSangre());
            rs.updateInt("castrado", ex.getCastrado());
            rs.updateInt("estado", ex.getEstado());
            
            rs.insertRow();
            rs.moveToCurrentRow();
            
            // Si el flujo llega hasta acá el registro se almacenó
            guardado = true; // Hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarExpediente(): "+e.getMessage());
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
        // Retornamos el valor de la bandera
	return guardado;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarExpediente(Expediente ex)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("expedienteID")==ex.getExpedienteID()){
                    //rs.updateInt("expedienteID", ex.getExpedienteID());
                    rs.updateInt("mascotaID", ex.getMascotaID());
                    rs.updateInt("numeroExpediente", ex.getNumeroExpediente());
                    rs.updateString("fechaRegistro", ex.getFechaRegistro());
                    rs.updateString("tipoSangre", ex.getTipoSangre());
                    rs.updateInt("castrado", ex.getCastrado());
                    rs.updateInt("estado", ex.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarExpediente(): "+e.getMessage());
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
    public boolean deleteExpediente(Expediente ex){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("expedienteID")==ex.getExpedienteID()){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteExpediente(): "+e.getMessage());
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
