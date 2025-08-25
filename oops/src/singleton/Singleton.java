package singleton;

public class Singleton {

    private Singleton(){

    }

    private static Singleton singleton;

    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }

        return singleton;
    }
}
