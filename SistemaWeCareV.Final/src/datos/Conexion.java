package datos;

import java.sql.*;

public class Conexion {
    
    // Unica instancia de la clase
    private static Conexion conx = null;
    
    
    // Atributos
    private static Connection con = null;
    private static String url = "jdbc:sqlserver://localhost;databaseName=WeCare;Persist Security Info=True;"; // databaseName= *Nombre de la base de datos*
    private static String user = "sa";
    private static String password = "jcminion653*"; // Poner aqui clave de su cuenta de SMSS
    
    // Constructor vacio
    private Conexion() {
        
    }
    
    
    // Instanciacion de la unica instancia de Conexion
    public static Conexion getInstance(){
        if(conx==null){
            conx = new Conexion();
        }
        return conx;
    }
     
    
    // Metodos
    public static Connection getConnection() {	
        if (estaConectado()==false) {
            Conexion.crearConexion();
            
        }
        return con; 
    }
    
   
    @SuppressWarnings("UseSpecificCatch")
    public static boolean estaConectado()
    {
        boolean resp = false;
        try{
            if ((con==null) || (con.isClosed())){
                resp = false;
            }
            else{
                resp = true;
            }                 
        }
        catch(Exception e){
            System.out.println("Error al consultar el estado de la conexion: "+e.getMessage());
        }
        return resp;
    }
   
    public static void crearConexion()
    {
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con= DriverManager.getConnection(url, user, password);
           System.out.println("Se conectó a la BD WeCare");
        } 
        catch (ClassNotFoundException e) {
           con=null;
           System.out.println("Error al cargar el driver:" +e.getMessage());
        } 
        catch (SQLException e) {
           con=null;
           System.out.println("Error al establecer la conexion:" +e.getMessage());
       }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public static void closeConexion(Connection con){
        if(estaConectado()!=false){
            try{
                con.close();
                System.out.println("Cerrando la conexion");
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }
    }
   
    public static void main(String args[])
    {
          
        new Conexion().getConnection();
        /*
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        con.closeConexion(cn);
        */
    }

}