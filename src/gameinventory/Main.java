package gameinventory;

public class Main {
    
    public static void main(String[] args){
        view v = new view();
        model m = new model();
        Database d = new Database();
        
        new controller().init(v, d);
        
        
        
    }
    

}
