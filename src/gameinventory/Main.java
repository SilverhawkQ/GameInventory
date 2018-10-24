package gameinventory;

public class Main {
    
    public static void main(String[] args){
        view v = new view();
        model m = new model();
        
        new controller().init(v, m);
        
        
        
    }
    

}
