/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author Toshiba
 */
public class Pagos {

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
     * @return the IdVivienda
     */
    public int getIdVivienda() {
        return IdVivienda;
    }

    /**
     * @param IdVivienda the IdVivienda to set
     */
    public void setIdVivienda(int IdVivienda) {
        this.IdVivienda = IdVivienda;
    }

    /**
     * @return the FechaPago
     */
    public Date getFechaPago() {
        return FechaPago;
    }

    /**
     * @param FechaPago the FechaPago to set
     */
    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public Pagos(int IdPago, int IdVivienda, Date FechaPago) {
        this.IdPago = IdPago;
        this.IdVivienda = IdVivienda;
        this.FechaPago = FechaPago;
    }
    
    private int IdPago;
    private int IdVivienda;
    private Date FechaPago;
    
}
