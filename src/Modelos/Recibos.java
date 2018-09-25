/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Toshiba
 */
public class Recibos {

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Monto
     */
    public Double getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the IdRecibos
     */
    public int getIdRecibos() {
        return IdRecibos;
    }

    /**
     * @param IdRecibos the IdRecibos to set
     */
    public void setIdRecibos(int IdRecibos) {
        this.IdRecibos = IdRecibos;
    }

    /**
     * @return the IdPago
     */
    public int getIdPago() {
        return IdPago;
    }

    /**
     * @param IdPago the IdPago to set
     */
    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Recibos(int IdRecibos, int IdPago, String Descripcion, Double Monto, String Estado) {
        this.IdRecibos = IdRecibos;
        this.IdPago = IdPago;
        this.Descripcion = Descripcion;
        this.Monto = Monto;
        this.Estado = Estado;
    }
    
    private int IdRecibos;
    private int IdPago;
    private String Descripcion;
    private Double Monto;
    private String Estado;
    
}
