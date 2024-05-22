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
public class Aconnector {
      public Connection connect;
        
     public Aconnector(){
        try{
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db", "root", "");
            }catch(SQLException ex){
                System.err.println("Cannot connect to database: " + ex.getMessage());
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
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            result =0;
            }
        return result;
    }
         public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }
     
         public void deleteData(int id, String table, String table_id){
            try{
                PreparedStatement pst = connect.prepareStatement("DELETE FROM "+table+" WHERE "+table_id+" = ?");
                pst.setInt(1, id);
                int rowsDeleted = pst.executeUpdate();
                    if(rowsDeleted > 0){
                        JOptionPane.showMessageDialog(null, "Deleted Successfully!");
                    }else{
                        System.out.println("Deletion Failed!");
                    }
                    pst.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Data cannot be deleted\nContact the administrator.");
            }
        }
        
}

