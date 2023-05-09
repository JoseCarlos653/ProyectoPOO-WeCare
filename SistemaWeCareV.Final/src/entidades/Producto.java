package entidades;

public class Producto {
    
    // Atributos
    private int productoID;
    private int tipoproductoID;
    private String nombreProducto;
    private float precio;
    private String marca;
    private String descripcion;
    private String fechaIngreso;
    private String fechaVencimiento;
    private int estado;
    
    
    // Constructores
    public Producto() {
    }

    public Producto(int productoID, int tipoproductoID, String nombreProducto, float precio, String marca, String descripcion, String fechaIngreso, String fechaVencimiento, int estado) {
        this.productoID = productoID;
        this.tipoproductoID = tipoproductoID;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    
    // Metodos especificos de los atributos
    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public int getTipoproductoID() {
        return tipoproductoID;
    }

    public void setTipoproductoID(int tipoproductoID) {
        this.tipoproductoID = tipoproductoID;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        //return "Producto{" + "descripcion=" + descripcion + '}';
        return this.getDescripcion();
    }
}
