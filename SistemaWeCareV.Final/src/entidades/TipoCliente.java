/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author JoseCarlos
 */
public class TipoCliente {
    //Atributos
    private int tipoclienteID;
    private String frecuencia;
    private int estado;
    
    //Constructores 
    public TipoCliente() {
    }

    public TipoCliente(int tipoclienteID, String frecuencia, int estado) {
        this.tipoclienteID = tipoclienteID;
        this.frecuencia = frecuencia;
        this.estado = estado;
    }
    
    //Metodos
    public int getTipoclienteID() {
        return tipoclienteID;
    }

    public void setTipoclienteID(int tipoclienteID) {
        this.tipoclienteID = tipoclienteID;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return frecuencia;
    }
    
    
}
