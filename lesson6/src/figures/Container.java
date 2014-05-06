package figures;

import java.util.ArrayList;

/**
 * Created by tish on 09.02.14.
 */
public class Container {
    private ArrayList<Figure> figures;

    public Figure maxPer(){
        Figure result = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).calcPer() > result.calcPer()){
                result = figures.get(i);
            }
        }
        return result;
    }

    public Figure maxArea(){
        Figure result = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).calcArea() > result.calcArea()){
                result = figures.get(i);
            }
        }
        return result;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }
}
