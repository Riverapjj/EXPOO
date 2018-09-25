/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class ValidacionesCampos {
    
    public boolean validarJTextFields(JTextField[] listaJTextField, String[] NombreCampo){
        
        boolean esValido = true;
        
        if(listaJTextField.length!=NombreCampo.length){
        
            esValido = false;
            System.out.println("Longitud de lista de textfield debe ser igual a lista de campos.");           
            
            
        }else{
        
            for(int i = 0; i< listaJTextField.length;i++){
                
                if(listaJTextField[i].getText().trim().length() == 0){
                                   
                    JOptionPane.showMessageDialog(null, "El campo: " + NombreCampo[i] + ", es requerido.");
                    esValido = false;
                    
                }
            
            }
            
        }
        
        
            
            
        
        return esValido;
    
    }
    
}
