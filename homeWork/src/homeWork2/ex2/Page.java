package homeWork2.ex2;

import java.util.ArrayList;

/**
 * Created by tish on 12.02.14.
 */
public class Page {
    private int number;
    private ArrayList<String> lines;

    public Page(int number, ArrayList<String> lines) {
        this.number = number;
        this.lines = lines;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    public void toWord(){

    }
}
