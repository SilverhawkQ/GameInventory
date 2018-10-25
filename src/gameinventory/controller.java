package gameinventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controller {

    
    public void init(view v, Database d) {
        v.setVisible(true);

        v.addAction(new ActionListener() {       
            
            @Override
            public void actionPerformed(ActionEvent evt) {

                try {
                    System.out.println(v.getIDAdd()+ v.getNameAdd() + v.getPriceAdd() + v.getQuantityAdd());
                    d.addGame(v.getIDAdd(), v.getNameAdd(), v.getPriceAdd(), v.getQuantityAdd());
                } catch (SQLException ex) {
                    Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
               
            }
        });
        
        v.editAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        v.removeAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
    }

}
