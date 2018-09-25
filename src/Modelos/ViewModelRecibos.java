/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Palacios
 */
public class ViewModelRecibos {
    private int IdRecibos;
    private int IdPago;
    private int idVivienda;
       private int IdResidente;
       private String NombreResidente;
    private int IdMembresia;
    private String TipoMembresia;
    private int IdDueno;
    private String NombreDueno;
    private double Valor;
    private double Cuota;
    private double Monto;
    private String Descripcion;
    private String TipoPago;
    private String EstadoPago;

    public ViewModelRecibos(){}
    
    public ViewModelRecibos(int IdRecibos, int IdPago, int idVivienda, int IdResidente, String NombreResidente, int IdMembresia, String TipoMembresia, int IdDueno, String NombreDueno, double Valor, double Cuota, double Monto, String Descripcion, String TipoPago, String EstadoPago) {
        this.IdRecibos = IdRecibos;
        this.IdPago = IdPago;
        this.idVivienda = idVivienda;
        this.IdResidente = IdResidente;
        this.NombreResidente = NombreResidente;
        this.IdMembresia = IdMembresia;
        this.TipoMembresia = TipoMembresia;
        this.IdDueno = IdDueno;
        this.NombreDueno = NombreDueno;
        this.Valor = Valor;
        this.Cuota = Cuota;
        this.Monto = Monto;
        this.Descripcion = Descripcion;
        this.TipoPago = TipoPago;
        this.EstadoPago = EstadoPago;
    }

    
    
    public int getIdRecibos() {
        return IdRecibos;
    }

    public void setIdRecibos(int IdRecibos) {
        this.IdRecibos = IdRecibos;
    }

    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    public int getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(int idVivienda) {
        this.idVivienda = idVivienda;
    }

    public int getIdResidente() {
        return IdResidente;
    }

    public void setIdResidente(int IdResidente) {
        this.IdResidente = IdResidente;
    }

    public String getNombreResidente() {
        return NombreResidente;
    }

    public void setNombreResidente(String NombreResidente) {
        this.NombreResidente = NombreResidente;
    }

    public int getIdMembresia() {
        return IdMembresia;
    }

    public void setIdMembresia(int IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    public String getTipoMembresia() {
        return TipoMembresia;
    }

    public void setTipoMembresia(String TipoMembresia) {
        this.TipoMembresia = TipoMembresia;
    }

    public int getIdDueno() {
        return IdDueno;
    }

    public void setIdDueno(int IdDueno) {
        this.IdDueno = IdDueno;
    }

    public String getNombreDueno() {
        return NombreDueno;
    }

    public void setNombreDueno(String NombreDueno) {
        this.NombreDueno = NombreDueno;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double getCuota() {
        return Cuota;
    }

    public void setCuota(double Cuota) {
        this.Cuota = Cuota;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public String getEstadoPago() {
        return EstadoPago;
    }

    public void setEstadoPago(String EstadoPago) {
        this.EstadoPago = EstadoPago;
    }
    
    
    
    
}
