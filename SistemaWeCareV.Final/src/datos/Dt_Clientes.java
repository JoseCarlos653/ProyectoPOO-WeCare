/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JoseCarlos
 */
public class Dt_Clientes {
    //Atributos
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //Métodos
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT clienteID, tipoclienteID, wecareID, nombreCliente, apellidoCliente, edad, sexo, domicilio, telefonoConvencional, telefonoCelular, correo, cedula, estado FROM Cliente", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Clientes> listarClientes(){
        ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Clientes cli = new Clientes();
                
                cli.setClienteID(rs.getInt("clienteID"));
                cli.setTipoclienteID(rs.getInt("tipoclienteID"));
                cli.setWecareID(rs.getInt("wecareID"));
                cli.setNombreCliente(rs.getString("nombreCliente"));
                cli.setApellidoCliente(rs.getString("apellidoCliente"));
                cli.setEdad(rs.getInt("edad"));
                cli.setSexo(rs.getInt("sexo"));
                cli.setDomicilio(rs.getString("domicilio"));
                cli.setTelefonoConvencional(rs.getString("telefonoConvencional"));
                cli.setTelefonoCelular(rs.getString("telefonoCelular"));
                cli.setCorreo(rs.getString("correo"));
                cli.setCedula(rs.getString("cedula"));
                cli.setEstado(rs.getInt("estado"));
                listaClientes.add(cli);
            }
        }catch(SQLException e){
            System.out.println("Error en listarClientes(): "+e.getMessage());
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
         return listaClientes;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarCliente (Clientes cli)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("clienteID", cli.getClienteID()); //La Base de Datos asiganara automaticamente el ID de cliente
            rs.updateInt("tipoclienteID", cli.getTipoclienteID());
            rs.updateInt("wecareID", cli.getWecareID());
            rs.updateString("nombreCliente", cli.getNombreCliente());
            rs.updateString("apellidoCliente", cli.getApellidoCliente());
            rs.updateInt("edad", cli.getEdad());
            rs.updateInt("sexo", cli.getSexo());
            rs.updateString("domicilio", cli.getDomicilio());
            rs.updateString("telefonoConvencional", cli.getTelefonoConvencional());
            rs.updateString("telefonoCelular", cli.getTelefonoCelular());
            rs.updateString("correo", cli.getCorreo());
            rs.updateString("cedula", cli.getCedula());
            rs.updateInt("estado", cli.getEstado());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarCliente(): "+e.getMessage());
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
    public boolean existeCliente(Clientes cli){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("nombreCliente").equals(cli.getNombreCliente()) && rs.getString("apellidoCliente").equals(cli.getApellidoCliente())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeCliente(): "+e.getMessage());
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
    public boolean editarCliente(Clientes cli)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("clienteID") == cli.getClienteID()){
                    rs.updateInt("tipoclienteID", cli.getTipoclienteID());
                    rs.updateInt("wecareID", cli.getWecareID());
                    rs.updateString("nombreCliente", cli.getNombreCliente());
                    rs.updateString("apellidoCliente", cli.getApellidoCliente());
                    rs.updateInt("edad", cli.getEdad());
                    rs.updateInt("sexo", cli.getSexo());
                    rs.updateString("domicilio", cli.getDomicilio());
                    rs.updateString("telefonoConvencional", cli.getTelefonoConvencional());
                    rs.updateString("telefonoCelular", cli.getTelefonoCelular());
                    rs.updateString("correo", cli.getCorreo());
                    rs.updateString("cedula", cli.getCedula());
                    rs.updateInt("estado", cli.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarCliente(): "+e.getMessage());
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
    public boolean deleteCliente(Clientes cli){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("clienteID") == cli.getClienteID()){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteCliente(): "+e.getMessage());
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
