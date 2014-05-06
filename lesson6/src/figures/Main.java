package figures;

import java.util.ArrayList;

/**
 * Created by tish on 09.02.14.
 */
public class Main {
    public static void main(String[] args) {
        Container c = new Container();

        Figure c0 = new Circle("circle 0", 5);
        Figure c1 = new Circle("circle 1", 7);

        Figure s0 = new Square("square 0", 10);
        Figure s1 = new Square("square 1", 3);

        Figure t0 = new Triangle("triangle 0", 4);
        Figure t1 = new Triangle("triangle 1", 6);

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(c0);
        figures.add(c1);
        figures.add(s0);
        figures.add(s1);
        figures.add(t0);
        figures.add(t1);

        c.setFigures(figures);

        Figure f = c.maxArea();
        System.out.println(f.getName());

        System.out.println();

        if (f instanceof Circle){
            Circle circle = (Circle) f;
            System.out.println(circle.getR());
            System.out.println("Circle");
        }

    }
}
