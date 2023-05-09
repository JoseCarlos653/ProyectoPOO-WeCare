package entidades;

public class Inventario {
    
    // Atributos
    private int inventarioID;
    private int bodegaID;
    private int productoID;
    private int cantidadInicial;
    private String fecha;
    private int movimientosPositivos;
    private int movimientosNegativos;
    private String numerosDocumento;
    private int saldoFinal;

    
    // Constructores
    public Inventario() {
    }

    public Inventario(int inventarioID, int bodegaID, int productoID, int cantidadInicial, String fecha, int movimientosPositivos, int movimientosNegativos, String numerosDocumento, int saldoFinal) {
        this.inventarioID = inventarioID;
        this.bodegaID = bodegaID;
        this.productoID = productoID;
        this.cantidadInicial = cantidadInicial;
        this.fecha = fecha;
        this.movimientosPositivos = movimientosPositivos;
        this.movimientosNegativos = movimientosNegativos;
        this.numerosDocumento = numerosDocumento;
        this.saldoFinal = saldoFinal;
    }

    
    // Metodos especificos de los atributos
    public int getInventarioID() {
        return inventarioID;
    }

    public void setInventarioID(int inventarioID) {
        this.inventarioID = inventarioID;
    }

    public int getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(int bodegaID) {
        this.bodegaID = bodegaID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMovimientosPositivos() {
        return movimientosPositivos;
    }

    public void setMovimientosPositivos(int movimientosPositivos) {
        this.movimientosPositivos = movimientosPositivos;
    }

    public int getMovimientosNegativos() {
        return movimientosNegativos;
    }

    public void setMovimientosNegativos(int movimientosNegativos) {
        this.movimientosNegativos = movimientosNegativos;
    }

    public String getNumerosDocumento() {
        return numerosDocumento;
    }

    public void setNumerosDocumento(String numerosDocumento) {
        this.numerosDocumento = numerosDocumento;
    }

    public int getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(int saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
}
