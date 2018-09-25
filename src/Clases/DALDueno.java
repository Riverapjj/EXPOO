/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Modelos.Dueno;
import Modelos.Viviendas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class DALDueno extends Conexion{
    
    
    public DALDueno(){
    
        super();
    }
    
    //LISTA PARA OBTENER TODOS LOS DUEÑOS DE LA BASE DE DATOS
     public List<Dueno> getDuenos() throws SQLException{
        
        
            List<Dueno> listaDuenos = new LinkedList<Dueno>();
            
            try {
                
                String sql = "SELECT * FROM vw_Duenos";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Dueno duenos = 
                            new Dueno(rs.getInt("IdDueno")
                                    ,rs.getString("Nombre")
                                    ,rs.getString("Telefono")
                                    ,rs.getString("Direccion")
                                    ,rs.getString("DUI"));
                                       
            
             listaDuenos.add(duenos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaDuenos;
     }
     
     
     //LISTA PARA OBTENER UN SOLO DUEÑO EN ESPECÍFICO
     public List<Dueno> getDuenos(int Id) throws SQLException{
        
        
            List<Dueno> listaDuenos = new LinkedList<Dueno>();
            
            try {
                
                String sql = "SELECT * FROM vw_Duenos WHERE IdDueno = ?";
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, Id);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Dueno duenos = 
                            new Dueno(rs.getInt("IdDueno")
                                    ,rs.getString("Nombre")
                                    ,rs.getString("Telefono")
                                    ,rs.getString("Direccion")
                                    ,rs.getString("DUI"));
                                       
            
             listaDuenos.add(duenos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaDuenos;
     }
     
     
}
