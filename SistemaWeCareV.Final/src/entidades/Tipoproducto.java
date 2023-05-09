package entidades;

public class Tipoproducto {
    
    // Atributos
    private int tipoproductoID;
    private String nombreTipoProducto;
    private String descripcion;
    private int estado;
    

    // Constructores
    public Tipoproducto() {
    }

    public Tipoproducto(int tipoproductoID, String nombreTipoProducto, String descripcion, int estado) {
        this.tipoproductoID = tipoproductoID;
        this.nombreTipoProducto = nombreTipoProducto;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getTipoproductoID() {
        return tipoproductoID;
    }

    public void setTipoproductoID(int tipoproductoID) {
        this.tipoproductoID = tipoproductoID;
    }

    public String getNombreTipoProducto() {
        return nombreTipoProducto;
    }

    public void setNombreTipoProducto(String nombreTipoProducto) {
        this.nombreTipoProducto = nombreTipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombreTipoProducto;
    }
    
    
    
}
