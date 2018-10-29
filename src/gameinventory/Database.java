
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



    public void CreateTable(String tableName, String fields) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            stmt = conn.createStatement();
            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            PreparedStatement tab = conn.prepareStatement("CREATE TABLE IF NOT EXISTS "+tableName+fields);;
            tab.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

     public void getTable(view v) throws SQLException {

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "Select * from choice";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);

            ResultSet rs = p.executeQuery();;
            v.setGameModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            conn.commit();
            p.close();

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public void getPublisher(view v) throws SQLException {
         
         
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "Select * from publisher";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);

            ResultSet rs = p.executeQuery();;
            v.setPublisherModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            conn.commit();
            p.close();

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

     
     public void getDescription(view v) throws SQLException {

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "Select * from description";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);

            ResultSet rs = p.executeQuery();;
            v.setDescriptionModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            conn.commit();
            p.close();

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void addGame(String id, String title, String description, String price, String quantity) throws SQLException {

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "Insert into choice values(?,?,?,?,?)";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);
             
            p.setString(1, id);
            p.setString(2, title);
            p.setString(3, description);
            p.setString(4, price);
            p.setString(5, quantity);
            
           

            p.executeUpdate();;
            conn.commit();
            p.close();

            //v.setGameTable();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String sqll = "Insert into description values(?,?)";
            PreparedStatement p;
            p = conn.prepareStatement(sqll);
             
            p.setString(1, title);
            p.setString(2, description);
 
            
           

            p.executeUpdate();;
            conn.commit();
            p.close();

            //v.setGameTable();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
    
    public void deleteGame(String id, String title, String description, String price, String quantity) throws SQLException {

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "DELETE from choice where title='"+title+"' OR id='"+id+"'";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);

            p.executeUpdate();;
            conn.commit();
            p.close();


        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        public void addPublisher(String publisher, String description) throws SQLException {

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String useproject2 = "use project2";
            stmt.executeUpdate(useproject2);

            String showchoice = "Insert into publisher values(?,?)";
            PreparedStatement p;
            p = conn.prepareStatement(showchoice);
             
            p.setString(1, publisher);
            p.setString(2, description);

            
           

            p.executeUpdate();;
            conn.commit();
            p.close();

            //v.setGameTable();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
