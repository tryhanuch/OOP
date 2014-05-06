package multi;

/**
 * Created by tish on 30.03.2014.
 */
public class Main {
    public static void main(String[] args) {
        IA a = new A();
        IB b = new B();
        C c = new C();

        c.a();

        a = c;
        b = c;
        c.b();

    }
}
