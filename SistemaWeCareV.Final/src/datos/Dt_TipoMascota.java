/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Tipomascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Leite
 */
public class Dt_TipoMascota {
    
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
            ps = con.prepareStatement("SELECT tipomascotaID, nombreTipoMascota, descripcion, estado FROM Tipomascota", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Tipomascota> listarTipoMascota(){
        ArrayList<Tipomascota> listaTiposMascotas = new ArrayList<Tipomascota>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Tipomascota d = new Tipomascota();
                d.setTipomascotaID(rs.getInt("TipomascotaID"));
                d.setNombreTipoMascota(rs.getString("nombreTipoMascota"));
                d.setDescripcion(rs.getString("descripcion"));
                d.setEstado(rs.getInt("estado"));
                listaTiposMascotas.add(d);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarDeptos(): "+e.getMessage());
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
        
        
        return listaTiposMascotas;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarTipoMascota (Tipomascota tp)
    {
        // Declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("tipomascotaID", tp.getTipomascotaID());
            rs.updateString("nombreTipoMascota", tp.getNombreTipoMascota());
            rs.updateString("descripcion", tp.getDescripcion());
            rs.updateInt("estado", tp.getEstado());
            rs.insertRow();
            rs.moveToCurrentRow();
            
            // Si el flujo llega hasta acá el registro se almacenó
            guardado = true; // Hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarConsulta(): "+e.getMessage());
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
    public boolean existeTipoMascota(String id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("tipomascotaID").equals(id)){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeTipoMascota(): "+e.getMessage());
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
    public boolean editarTipoMascota(Tipomascota tp)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("tipomascotaID")==tp.getTipomascotaID()){
                    //rs.updateInt("tipomascotaID", tp.getTipomascotaID());
                    rs.updateString("nombreTipoMascota", tp.getNombreTipoMascota());
                    rs.updateString("descripcion", tp.getDescripcion());
                    rs.updateInt("estado", tp.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarTipoMascota(): "+e.getMessage());
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
