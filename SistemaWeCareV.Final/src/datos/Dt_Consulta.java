/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Leite
 */
public class Dt_Consulta {
    
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
            ps = con.prepareStatement("SELECT consultaID, expedienteID, fechaConsulta, nombreMedico, tratamiento, peso, estadoSaludGeneral, diagnostico, seguimiento, resultadosExamenes FROM Consulta", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Consulta> listarConsulta(){
        ArrayList<Consulta> listaConsultas = new ArrayList<Consulta>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Consulta d = new Consulta();
                d.setConsultaID(rs.getInt("consultaID"));
                d.setExpedienteID(rs.getInt("expedienteID"));
                d.setFechaConsulta(rs.getString("fechaConsulta"));
                d.setNombreMedico(rs.getString("nombreMedico"));
                d.setTratamiento(rs.getString("tratamiento"));
                d.setPeso(rs.getFloat("peso"));
                d.setEstadoSaludGeneral(rs.getString("estadoSaludGeneral"));
                d.setDiagnostico(rs.getString("diagnostico"));
                d.setSeguimiento(rs.getString("seguimiento"));
                d.setResultadosExamenes(rs.getString("resultadosExamenes"));
                listaConsultas.add(d);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarConsultas(): "+e.getMessage());
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
        
        
        return listaConsultas;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean existeConsulta(String id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("ConsultaID").equals(id)){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeConsulta(): "+e.getMessage());
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
    public boolean guardarConsulta (Consulta c)
    {
        // Declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("consultaID", c.getConsultaID());
            rs.updateInt("expedienteID", c.getExpedienteID());
            rs.updateString("fechaConsulta", c.getFechaConsulta());
            rs.updateString("nombreMedico", c.getNombreMedico());
            rs.updateString("tratamiento", c.getTratamiento());
            rs.updateFloat("peso", c.getPeso());
            rs.updateString("estadoSaludGeneral", c.getEstadoSaludGeneral());
            rs.updateString("diagnostico", c.getDiagnostico());
            rs.updateString("seguimiento", c.getSeguimiento());
            rs.updateString("resultadosExamenes", c.getResultadosExamenes());
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
    public boolean editarConsulta(Consulta c)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("consultaID")==c.getConsultaID()){
                    rs.updateInt("expedienteID", c.getExpedienteID());
                    rs.updateString("fechaConsulta", c.getFechaConsulta());
                    rs.updateString("nombreMedico", c.getNombreMedico());
                    rs.updateString("tratamiento", c.getTratamiento());
                    rs.updateFloat("peso", c.getPeso());
                    rs.updateString("estadoSaludGeneral", c.getEstadoSaludGeneral());
                    rs.updateString("diagnostico", c.getDiagnostico());
                    rs.updateString("seguimiento", c.getSeguimiento());
                    rs.updateString("resultadosExamenes", c.getResultadosExamenes());
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
    public boolean existeConsulta(Consulta c){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("consultaID").equals(c.getConsultaID())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeConsulta(): "+e.getMessage());
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
    public boolean deleteConsulta(Consulta c){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("consultaID")==c.getConsultaID()){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteConsulta(): "+e.getMessage());
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


