package singleton;

/**
 * Created by tish on 02.03.14.
 */
public class Singleton {

    private static Singleton sl;

    public static Singleton createSingleton(){
        if (sl == null){
            sl = new Singleton();
        }
        return sl;
    }

    private Singleton() {
    }
}
