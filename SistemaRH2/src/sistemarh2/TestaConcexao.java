/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rafae
 */
public class TestaConcexao {
   public static void main(String args[]){
       try{
        Connection con = new ConnectionFactory().getConnection();
        String sql = "select * from cliente";
        PreparedStatement pstmt = con.prepareStatement(sql);
        //pstmt.setString(1, "Souza");
        //pstmt.setString(2, "Souza");
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
            String nome = rs.getString("nome");
            String sobrenome = rs.getString(2);
            System.out.println("Nome: "+nome + " Sobrenome:"+sobrenome);
        }
        
       }catch(Exception ex){
           ex.printStackTrace();
       }

   } 
}
