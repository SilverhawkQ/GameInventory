/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameinventory;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
    private static final String USERNAME= "root";
    private static final String PASSWORD= "Wlsdud1964";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/project2";

public static void main(String[] args){
    
    

    Connection conn =null;
    Statement stmt = null;
    ResultSet rs= null;
    
        try {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            
            stmt = conn.createStatement();
            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);
            
            String showchoice = "select * from choice";
            rs = stmt.executeQuery(showchoice);
            while(rs.next()){
                System.out.printf("%-14s\t", rs.getString(1));
                System.out.printf("%-14s\t", rs.getString(2));
                System.out.printf("%-14s\t", rs.getString(3));
                System.out.printf("%-14s\t", rs.getString(4));
                System.out.printf("%-14s\t\n", rs.getString(5));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("Connected");
}


}


