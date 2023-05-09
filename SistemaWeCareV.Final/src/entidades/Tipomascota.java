package entidades;

public class Tipomascota {
    
    // Atributos
    private int tipomascotaID;
    private String nombreTipoMascota;
    private String descripcion;
    private int estado;
    

    // Constructores
    public Tipomascota() {
    }

    public Tipomascota(int tipomascotaID, String nombreTipoMascota, String descripcion, int estado) {
        this.tipomascotaID = tipomascotaID;
        this.nombreTipoMascota = nombreTipoMascota;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getTipomascotaID() {
        return tipomascotaID;
    }

    public void setTipomascotaID(int tipomascotaID) {
        this.tipomascotaID = tipomascotaID;
    }

    public String getNombreTipoMascota() {
        return nombreTipoMascota;
    }

    public void setNombreTipoMascota(String nombreTipoMascota) {
        this.nombreTipoMascota = nombreTipoMascota;
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
        return nombreTipoMascota;
    }
}
