/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author panay
 */
public class ObjetoCasas {
    private int IdCasa;
    private int IdEstado;
      private String Dueno;
      private String Residente;
      private String Direccion;
      private String Cuota;
      private String Croquis;
      private String DescripcionEstadoVivienda;

    public ObjetoCasas(int IdCasa, int IdEstado){
    this.IdCasa=IdCasa;
    this.IdEstado=IdEstado;
    
    }
    
    public ObjetoCasas(){
    
    }
    
    
    public ObjetoCasas(int IdCasa, int IdEstado, String Dueno,String Residente,String Direccion,String Cuota,String Croquis,String DescripcionEstadoVivienda ){
    this.IdCasa=IdCasa;
    this.IdEstado=IdEstado;
    this.Dueno=Dueno;
    this.Residente=Residente;
    this.Direccion=Direccion;
    this.Cuota=Cuota;
    this.Croquis=Croquis;
    this.DescripcionEstadoVivienda=DescripcionEstadoVivienda;
    
    }    
    public int GetIdCasas(){
    return this.IdCasa;
    }
    
     public int GetIdEstado(){
     return this.IdEstado;
    }
    
     public JPanel GetallData(){
     JPanel mio=new JPanel();
     String texto="<html><body>Dueno:"+Dueno+"<br>Residente:"+Residente+"<br>Direccion:"+Direccion+"<br>Cuota:$"+Cuota+"<br>Ubicacion:"+Croquis+"<br>Estado:"+DescripcionEstadoVivienda+"<br></body></html>";
     mio.add(new JLabel(texto));
     
    
     
    return mio; 
     }
}
