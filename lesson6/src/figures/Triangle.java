package figures;

/**
 * Created by tish on 09.02.14.
 */
public class Triangle extends Figure {
    private int a;

    public Triangle(String name, int a) {
        super(name);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double calcArea() {
        return ((a * a) * Math.sqrt(3)) / 4;
    }

    @Override
    public double calcPer() {
        return a * 3;
    }
}
