public class SingleObject{
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }
    public static SingleObject getLastName(){
        return instance;
        
    }
    public static void getInstance() {
        System.out.println("Hello prabina");
        
    }
}

