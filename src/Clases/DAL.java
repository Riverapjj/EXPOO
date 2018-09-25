/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author panay
 */
public class DAL {
    
    
public static ArrayList<String> executeSprocInParams(Connection con, int rolID) throws SQLException {  
  ArrayList<String> retorno = new ArrayList<String>(); 
  
  try{  
      
        PreparedStatement pstmt = con.prepareStatement("{call dbo.getMenubyRol(?)}");
        pstmt.setInt(1, rolID);  
        ResultSet rs = pstmt.executeQuery();  

        while (rs.next()) {  
         
           retorno.add(rs.getString("Nombre"));  
           
    } 
        
        
}catch(Exception ex){
      System.out.println("========================================Aqui va esto que interesa+++++++++++++++++++++++++");
      System.out.println(Arrays.toString(ex.getStackTrace()));
       System.out.println("========================================Final+++++++++++++++++++++++++");

}
  finally{
//   con.close();
         
  }
    return retorno;
}
public static int GetRolId(Connection con, String User) throws SQLException {  
  int retorno = 1; 
  try(PreparedStatement pstmt = con.prepareStatement("{call dbo.getRolIDbyUser(?)}"); ) {  

        pstmt.setString(1, User);  
        ResultSet rs = pstmt.executeQuery();  

        while (rs.next()) {  
         
           retorno=rs.getInt("IdRol");  
            
    } 
        
}finally{
//   con.close();
         
  }
    return retorno;
}

public static int GetPrimeraVez(Connection con, String User) throws SQLException {  
  int retorno = 1; 
  try(PreparedStatement pstmt = con.prepareStatement("{call dbo.GetFirstTimeByUser(?)}"); ) {  

        pstmt.setString(1, User);  
        ResultSet rs = pstmt.executeQuery();  

        while (rs.next()) {  
         
           retorno=rs.getInt("PrimeraVez");  
            
    } 
        
}finally{
//   con.close();
         
  }
    return retorno;
}



public int Validaracceso(Connection con, String User, String Password) throws SQLException {  
  int retorno = 0; 
  try(PreparedStatement pstmt = con.prepareStatement("{call dbo.isValidUser(?,?)}"); ) {  

        pstmt.setString(1, User); 
        pstmt.setString(2, Password);  

        ResultSet rs = pstmt.executeQuery();  

        while (rs.next()) {  
         
           retorno=rs.getInt("resultado");  
            
    } 
        
}finally{
//   con.close();
         
  }
    return retorno;
}

public int vali(Statement s,String User, String Password){
    int retorno = 0; 
     //Statement s = cn.getConexion().createStatement();
     return retorno;
}

public static List<ObjetoCasas> ObtenerCasas(Connection con) throws SQLException{
List<ObjetoCasas> Casas=new ArrayList<ObjetoCasas>();

try(PreparedStatement pstmt = con.prepareStatement("{call sp_GetListVivienda}"); ) {  

        ResultSet rs = pstmt.executeQuery();  

        while (rs.next()) {  
         
           ObjetoCasas a=new ObjetoCasas(rs.getInt("numeroCasa"),rs.getInt("IdEstado"));  
           Casas.add(a);
            
    } 

return Casas;
}

}


public static void GenerarFactura(Connection con) throws SQLException{
        try {  
PreparedStatement pstmt = con.prepareStatement("{call GenerarFacturas}");
pstmt.executeQuery();
        

        
    }catch(Exception e){
       System.out.println(e);
    }

}
public static ObjetoCasas ObtenerCasasPorId(Connection con, int IdCasa) throws SQLException{
ObjetoCasas Casas=new ObjetoCasas();

try(PreparedStatement pstmt = con.prepareStatement("{call sp_GetListViviendaById(?)}"); ) {  
pstmt.setInt(1, IdCasa);
        ResultSet rs = pstmt.executeQuery();  

        while (rs.next()) {  
         
         Casas=new ObjetoCasas(rs.getInt("numeroCasa"),rs.getInt("IdEstado"),rs.getString("Dueno"),rs.getString("Residente"),rs.getString("Direccion") ,rs.getString("Cuota") ,rs.getString("Croquis") ,rs.getString("DescripcionEstadoVivienda"));  
           
            
    } 

return Casas;
}

}

}