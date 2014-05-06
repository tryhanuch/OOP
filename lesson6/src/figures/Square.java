package figures;

/**
 * Created by tish on 09.02.14.
 */
public class Square extends Figure {
    private int b;

    public Square(String name, int b) {
        super(name);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calcArea() {
        return b * b;
    }

    @Override
    public double calcPer() {
        return b * 4;
    }
}
