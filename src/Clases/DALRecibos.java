/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Conexion.cn;
import Modelos.*;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class DALRecibos extends Conexion{
    
    public DALRecibos(){
    
        super();
    }
    
    
    //PROCEDIMIENTO ALMACENADO PARA INSERTAR RECIBOS
    public int SPInsertarRecibos(int IdVivienda,String Descripcion,Double Monto,Date FechaPago,String Estado,String TipoPago,String IdMembresiaNombre,String IdResidenteNombre) throws SQLException{
        
        CallableStatement callStatement = null;
        callStatement = this.cn.prepareCall("{call sp_InsertarRecibo(?,?,?,?,?,?,?,?)}");
        callStatement.setInt(1, IdVivienda);
        callStatement.setString(2, Descripcion);
        callStatement.setDouble(3, Monto);
        callStatement.setDate(4, FechaPago);
        callStatement.setString(5,Estado);
        callStatement.setString(6,TipoPago);
        callStatement.setString(7,IdMembresiaNombre);
        callStatement.setString(8,IdResidenteNombre);

       // callStatement.executeQuery();
        
        ResultSet rs = callStatement.executeQuery();
        int id = 0;
        if(rs.next()) {
    
            id = rs.getInt("Id");
    //System.out.println("Equipment ID: " + rs.getString("equipmentID"));
    }
    
        return id;
    }
    
    
    //PROCEDIMIENTO ALMACENADO PARA MODIFICAR RECIBOS
    public int SPModificarRecibos(int IdRecibos,String Descripcion,Double Monto,String Estado) throws SQLException{
        
        CallableStatement callStatement = null;
        callStatement = this.cn.prepareCall("{call sp_ModificarRecibo(?,?,?,?)}");
        callStatement.setInt(1, IdRecibos);
        callStatement.setString(2, Descripcion);
        callStatement.setDouble(3, Monto);
        callStatement.setString(4, Estado);

        //callStatement.executeQuery();
        
        ResultSet rs = callStatement.executeQuery();
        int id = 0;
        if(rs.next()) {
    
            id = rs.getInt("Id");
    //System.out.println("Equipment ID: " + rs.getString("equipmentID"));
    }
    
        return id;
    }
    
    
    
    //LISTA PARA OBTENER RECIBOS DE LA BD
    public List<Recibos> getRecibos() throws SQLException{
        
        
            List<Recibos> listaRecibos = new LinkedList<Recibos>();
            
            try {
                
                String sql = "SELECT * FROM vw_Recibos";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Recibos recibos = 
                            new Recibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getString("Descripcion")
                                    ,rs.getDouble("Monto")
                                    ,rs.getString("EstadoPago"));
                                       
            
             listaRecibos.add(recibos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRecibos;
     }
    
    
    //LISTA PARA OBTENER UN RECIBO EN ESPECIFICO
    public List<Recibos> getRecibos(int Id) throws SQLException{
        
        
            List<Recibos> listaRecibos = new LinkedList<Recibos>();
            
            try {
                
                String sql = "SELECT * FROM vw_Recibos WHERE IdRecibos = ?";
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, Id);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Recibos recibos = 
                            new Recibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getString("Descripcion")
                                    ,rs.getDouble("Monto")
                                    ,rs.getString("EstadoPago"));
                                       
            
             listaRecibos.add(recibos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRecibos;
     }
    
        //LISTA PARA OBTENER RECIBOS DE LA BD
    public List<ViewModelRecibos> getViewModelRecibos() throws SQLException{
        
        
            List<ViewModelRecibos> listaRecibos = new LinkedList<ViewModelRecibos>();
            
            try {
                
                String sql = "SELECT * FROM ViewModelRecibos";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    ViewModelRecibos recibos = 
                            new ViewModelRecibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getInt("IdVivienda")
                                    ,rs.getInt("IdResidente")
                                    ,rs.getString("NombreResidente")
                                    ,rs.getInt("IdMembresia")
                                    ,rs.getString("TipoMembresia")
                                    ,rs.getInt("IdDueno")
                                    ,rs.getString("NombreDueno")
                                    ,rs.getDouble("Valor")
                                    ,rs.getDouble("Cuota")
                                    ,rs.getDouble("Monto")
                                    ,rs.getString("Descripcion")
                                    ,rs.getString("TipoPago")
                                    ,rs.getString("EstadoPago"));
                                       
            
             listaRecibos.add(recibos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRecibos;
     }
    
    
    //LISTA PARA OBTENER UN RECIBO EN ESPECIFICO
    public ViewModelRecibos getViewModelRecibos(int Id) throws SQLException{
        
        ViewModelRecibos viewRecibos = new ViewModelRecibos();
            
            try {
                
                String sql = "SELECT * FROM ViewModelRecibos WHERE IdRecibos = ?";
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, Id);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                     ViewModelRecibos recibos = 
                            new ViewModelRecibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getInt("IdVivienda")
                                    ,rs.getInt("IdResidente")
                                    ,rs.getString("NombreResidente")
                                    ,rs.getInt("IdMembresia")
                                    ,rs.getString("TipoMembresia")
                                    ,rs.getInt("IdDueno")
                                    ,rs.getString("NombreDueno")
                                    ,rs.getDouble("Valor")
                                    ,rs.getDouble("Cuota")
                                    ,rs.getDouble("Monto")
                                    ,rs.getString("Descripcion")
                                    ,rs.getString("TipoPago")
                                    ,rs.getString("EstadoPago"));
                                       
                                       
            
             viewRecibos = recibos;
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return viewRecibos;
     }
    
}
