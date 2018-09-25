/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author panay
 */
public class DynamicButton extends JButton {
    private int numerocasa;
    private int estadocasa;

    public DynamicButton(String Nombre) {
        super(Nombre); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getnumerocasa(){
        return this.numerocasa;
    }
   public int getestadocasa(){
        return this.estadocasa;
    }
   
       public void Setnumerocasa(int numcasa){
         this.numerocasa=numcasa;
    }
   public void Setestadocasa(int estado){
 this.estadocasa=estado;
 this.SetColorA(estado);
    }
   private void SetColorA(int estado){
       switch(estado){
           case 1:
               this.setBackground(Color.RED);
               break;
           case 2:
               this.setBackground(Color.GREEN);
               break;
           case 3:
               this.setBackground(Color.GRAY);
               break;
                       
       }
       
   }
}
