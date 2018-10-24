package gameinventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

public class controller {

    
    public void init(view v, model m, Database db) {
        v.setVisible(true);

        v.addAction(new ActionListener() {       
            
            @Override
            public void actionPerformed(ActionEvent evt) {
               
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
