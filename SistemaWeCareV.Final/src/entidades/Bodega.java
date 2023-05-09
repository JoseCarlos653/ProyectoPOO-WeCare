package entidades;

public class Bodega {
    
    // Atributos
    private int bodegaID;
    private int wecareID;
    private String nombreBodega;
    private String descripcion;
    private int estado;

    
    // Constructores
    public Bodega() {
    }

    public Bodega(int bodegaID, int wecareID, String nombreBodega, String descripcion, int estado) {
        this.bodegaID = bodegaID;
        this.wecareID = wecareID;
        this.nombreBodega = nombreBodega;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(int bodegaID) {
        this.bodegaID = bodegaID;
    }

    public int getWecareID() {
        return wecareID;
    }

    public void setWecareID(int wecareID) {
        this.wecareID = wecareID;
    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
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
        //return "Bodega{" + "descripcion=" + descripcion + '}';
        return this.getDescripcion();
        
    }
}
