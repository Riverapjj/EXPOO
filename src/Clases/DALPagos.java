/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Modelos.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class DALPagos extends Conexion{
    
    public DALPagos(){
    
        super();
    }
    
    //LISTA PARA OBTENER PAGOS DE LA BD
    public List<Pagos> getPagos() throws SQLException{
        
        
            List<Pagos> listaPagos = new LinkedList<Pagos>();
            
            try {
                
                String sql = "SELECT * FROM vw_Pagos";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Pagos pagos = 
                            new Pagos(rs.getInt("IdPago")
                                    ,rs.getInt("IdVivienda")
                                    ,rs.getDate("FechaPago"));
                                       
            
             listaPagos.add(pagos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaPagos;
     }
    
    
    //LISTA PARA OBTENER UN PAGO EN ESPECIFICO
    public List<Pagos> getPagos(int Id) throws SQLException{
        
        
            List<Pagos> listaPagos = new LinkedList<Pagos>();
            
            try {
                
                String sql = "SELECT * FROM vw_Pagos WHERE IdPago = ?";
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, Id);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Pagos pagos = 
                            new Pagos(rs.getInt("IdPago")
                                    ,rs.getInt("IdVivienda")
                                    ,rs.getDate("FechaPago"));
                                       
            
             listaPagos.add(pagos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaPagos;
     }
    
}
