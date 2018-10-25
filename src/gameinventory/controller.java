package gameinventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controller {

    
    public void init(view v, Database d) throws SQLException {
        v.setVisible(true);

        d.getTable(v);
        d.getPublisher(v);
        d.getDescription(v);
        
        v.addAction(new ActionListener() {       
            
            @Override
            public void actionPerformed(ActionEvent evt) {

                try {
                    System.out.println(v.getIDAdd()+ v.getNameAdd() + v.getPriceAdd() + v.getQuantityAdd());
                    d.addGame(v.getIDAdd(), v.getNameAdd(), v.getDescriptionAdd(), v.getPriceAdd(), v.getQuantityAdd());
                    
                    d.getTable(v);
                } catch (SQLException ex) {
                    Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
               
            }
        });
        
        
        v.removeAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try{
                    d.deleteGame(v.getIDAdd(), v.getNameAdd(), v.getDescriptionAdd(), v.getPriceAdd(), v.getQuantityAdd());
                    d.getTable(v);
                }catch (SQLException ex){
                    Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
