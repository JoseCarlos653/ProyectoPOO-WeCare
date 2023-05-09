package entidades;

public class Rol {
    
    // Atributos
    private int rolID;
    private String rolNombre;
    private int estado;

    
    // Constructores
    public Rol() {
    }

    public Rol(int rolID, String rolNombre, int estado) {
        this.rolID = rolID;
        this.rolNombre = rolNombre;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString() {
        return rolNombre;
    }
}
