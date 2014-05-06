package singleton;

/**
 * Created by tish on 02.03.14.
 */
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.createSingleton();//Замена вызова конструктора на вызов статического метода.
        Singleton s2 = Singleton.createSingleton();

        System.out.println(s1 == s2); //Будет ссылаться на один обьект.
    }
}
