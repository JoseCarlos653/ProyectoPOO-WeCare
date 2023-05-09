package entidades;

public class ProductoExpediente {
    
    // Atributos
    private int expedienteID;
    private int productoID;

    
    // Constructores
    public ProductoExpediente() {
    }

    public ProductoExpediente(int expedienteID, int productoID) {
        this.expedienteID = expedienteID;
        this.productoID = productoID;
    }
    
    
    // Metodos especificos de los atributos
    public int getExpedienteID() {
        return expedienteID;
    }

    public void setExpedienteID(int expedienteID) {
        this.expedienteID = expedienteID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }
}
