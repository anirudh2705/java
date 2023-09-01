package singleton;

public class Singleton {
    // singletone class allows to create only one class 
    private void Singleton(){
        
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        // check weather a object is created or not
        if( instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
