package entidades;

public class Usuario {
    
    // Atributos
    private int usuarioID;
    private int rolID;
    private String nombreUsuario;
    private String clave;
    private int estado;

    
    // Constructores
    public Usuario() {
    }

    public Usuario(int usuarioID, int rolID, String nombreUsuario, String clave, int estado) {
        this.usuarioID = usuarioID;
        this.rolID = rolID;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
