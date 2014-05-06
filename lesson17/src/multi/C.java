package multi;

/**
 * Created by tish on 30.03.2014.
 */
public class C implements IA, IB{

    private IA a = new A();
    private IB b = new B();

    public void a() {
        a.a();
    }

    public void b() {
        b.b();
    }
}
