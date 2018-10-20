package gameinventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    private model m = new model();
    private view v = new view();
    private String a = "";
    
    public void init() {
        v.setVisible(true);

    }

    public static void main(String[] args) {
        new controller().init();

    }
}
