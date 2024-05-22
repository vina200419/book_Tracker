/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lbixt
 */
public class Apconnector {
  
      private Connection connect;
        
     public Apconnector(){
        try{
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
     }
     
     
        
         public Connection connect_db(){
              try{
                connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
              return connect;
        }
     public ResultSet getData(String sql) throws SQLException {
        Statement statement = (Statement) connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
      public int insertData(String sql){
        int result;    
        try{
            PreparedStatement pstmt = connect.prepareStatement(sql);
           
            pstmt.executeUpdate();
            System.out.println("Inserted Successfully!");
            pstmt.close();
            result=1;
            }catch(SQLException e){
                System.out.println("Connection Error: "+e);
            result =0;
            }
        return result;
    }
       public void updateData(String sql){
        try {
     
            PreparedStatement pstmt = connect.prepareStatement(sql);
            int rowsUpdated = pstmt.executeUpdate();
            if(rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null,"Data updated successfully!");
            } else {
                System.out.println("Data Update failed!");            
            }
           
        } catch (SQLException ex) {
            
             System.out.println("Connection Error"+ex);  
        }
     }
     
        public void deleteData(int id,String table) {
    try {
        PreparedStatement stmt = connect.prepareStatement("DELETE FROM tbl_appointment WHERE book_id = ?");
        stmt.setInt(1, id);
        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
             JOptionPane.showMessageDialog(null,"Deleted Successfully!");
        } else {
            System.out.println("Deletion Failed.");
        }
        stmt.close();
        connect.close();
    } catch (SQLException e) {
        System.out.println("Connection Error " + e.getMessage());
    }

        }
    }
