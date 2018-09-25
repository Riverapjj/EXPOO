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
public class Dueno {

    /**
     * @return the IdDueno
     */
    public int getIdDueno() {
        return IdDueno;
    }

    /**
     * @param IdDueno the IdDueno to set
     */
    public void setIdDueno(int IdDueno) {
        this.IdDueno = IdDueno;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the DUI
     */
    public String getDUI() {
        return DUI;
    }

    /**
     * @param DUI the DUI to set
     */
    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public Dueno(int IdDueno, String Nombre, String Telefono, String Direccion, String DUI) {
        this.IdDueno = IdDueno;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.DUI = DUI;
    }
    
    private int IdDueno;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String DUI;
    
}
