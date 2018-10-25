package gameinventory;

import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        view v = new view();
        model m = new model();
        Database d = new Database();
        
        new controller().init(v, d);
        
        d.CreateTable("choice","(id varchar(255), title varchar(255), description varchar(255), price varchar(255), quantity varchar(255))");
        d.CreateTable("publisher","(publisher varchar(255), description varchar(255))");
        d.CreateTable("description","(title varchar(255), d varchar(255))");
        
    }
    

}
