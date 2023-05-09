package entidades;

public class Expediente {
    
    // Atributos
    private int expedienteID;
    private int mascotaID;
    private int numeroExpediente;
    private String fechaRegistro;
    private String tipoSangre;
    private int castrado;
    private int estado;

    
    // Constructores
    public Expediente() {
    }

    public Expediente(int expedienteID, int mascotaID, int numeroExpediente, String fechaRegistro, String tipoSangre, int castrado, int estado) {
        this.expedienteID = expedienteID;
        this.mascotaID = mascotaID;
        this.numeroExpediente = numeroExpediente;
        this.fechaRegistro = fechaRegistro;
        this.tipoSangre = tipoSangre;
        this.castrado = castrado;
        this.estado = estado;
    }
    
    
    // Metodos especificos de los atributos
    public int getExpedienteID() {
        return expedienteID;
    }

    public void setExpedienteID(int expedienteID) {
        this.expedienteID = expedienteID;
    }

    public int getMascotaID() {
        return mascotaID;
    }

    public void setMascotaID(int mascotaID) {
        this.mascotaID = mascotaID;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int getCastrado() {
        return castrado;
    }

    public void setCastrado(int castrado) {
        this.castrado = castrado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return Integer.toString(this.expedienteID);
    }
    
}
