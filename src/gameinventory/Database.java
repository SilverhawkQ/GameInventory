/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameinventory;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.DbUtils;

public class Database {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "MVCProject1";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/project2";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public void c() throws ClassNotFoundException {

        try {
            System.out.println("Connected");
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            stmt = conn.createStatement();
            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "select * from choice";
            rs = stmt.executeQuery(showchoice);
            while (rs.next()) {
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

    public void CreateTable() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            stmt = conn.createStatement();
            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String tab = "CREATE TABLE choice(id int, title varchar(255), price double, quantity int)";
            rs = stmt.executeQuery(tab);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void fillTable(view v) throws SQLException {
        ResultSet s;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "select * from choice";
            rs = stmt.executeQuery(showchoice);

            //v.setGameTable();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addGame(String id, String title, String price, String quantity) throws SQLException {
        ResultSet s;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "Insert into choice values(?,?,?,?)";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);
             
            p.setString(1, id);
            p.setString(2, title);
            p.setString(3, price);
            p.setString(4, quantity);
            
           

            int result = p.executeUpdate();;
            conn.commit();
            p.close();

            //v.setGameTable();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
