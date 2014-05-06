package figures;

/**
 * Created by tish on 09.02.14.
 */
public class Circle extends Figure {
    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calcPer() {
        return 2 * Math.PI * r;
    }
}
