/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Leite
 */
public class Dt_Mascota {
    
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
            ps = con.prepareStatement("SELECT mascotaID, clienteID, tipomascotaID, nombrePaciente, sexo, edad, especie, raza, color, fechaNacimiento FROM Mascota", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Mascota> listarMascota(){
        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Mascota d = new Mascota();
                d.setMascotaID(rs.getInt("mascotaID"));
                d.setClienteID(rs.getInt("clienteID"));
                d.setTipomascotaID(rs.getInt("tipomascotaID"));
                d.setNombrePaciente(rs.getString("nombrePaciente"));
                d.setSexo(rs.getInt("sexo"));
                d.setEdad(rs.getInt("edad"));
                d.setEspecie(rs.getString("especie"));
                d.setRaza(rs.getString("raza"));
                d.setColor(rs.getString("color"));
                d.setFechaNacimiento(rs.getString("fechaNacimiento"));
                listaMascotas.add(d);
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
        
        
        return listaMascotas;      
    }
    
    public boolean guardarMascota (Mascota m)
    {
        // Declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("mascotaID", m.getMascotaID());
            rs.updateInt("clienteID", m.getClienteID());
            rs.updateInt("tipomascotaID", m.getTipomascotaID());
            rs.updateString("nombrePaciente", m.getNombrePaciente());
            rs.updateInt("sexo", m.getSexo());
            rs.updateInt("edad", m.getEdad());
            rs.updateString("especie", m.getEspecie());
            rs.updateString("raza", m.getRaza());
            rs.updateString("color", m.getColor());
            rs.updateString("fechaNacimiento", m.getFechaNacimiento());
            rs.insertRow();
            rs.moveToCurrentRow();
            
            // Si el flujo llega hasta acá el registro se almacenó
            guardado = true; // Hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarMascota(): "+e.getMessage());
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
    public boolean existeMascota(String id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("mascotaID").equals(id)){
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
    public boolean editarMascota(Mascota m)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("mascotaID")==m.getMascotaID()){
                    //rs.updateInt("mascotaID", m.getMascotaID());
                    rs.updateInt("clienteID", m.getClienteID());
                    rs.updateInt("tipomascotaID", m.getTipomascotaID());
                    rs.updateString("nombrePaciente", m.getNombrePaciente());
                    rs.updateInt("sexo", m.getSexo());
                    rs.updateInt("edad", m.getEdad());
                    rs.updateString("especie", m.getEspecie());
                    rs.updateString("raza", m.getRaza());
                    rs.updateString("color", m.getColor());
                    rs.updateString("fechaNacimiento", m.getFechaNacimiento());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarConsulta(): "+e.getMessage());
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
    public boolean deleteMascota(Mascota m){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("mascotaID")==m.getMascotaID()){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteMascota(): "+e.getMessage());
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
