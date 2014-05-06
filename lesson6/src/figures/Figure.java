package figures;

/**
 * Created by tish on 09.02.14.
 */
abstract public class Figure {
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double calcArea();

    abstract public double calcPer();
}
