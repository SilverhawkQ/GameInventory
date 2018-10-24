package gameinventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    private model m = new model();
    private view v = new view();
    private String a = "";
    
    public void init() {
        v.setVisible(true);

        v.addAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                v.getName();
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

    public static void main(String[] args) {
        new controller().init();

    }
}
