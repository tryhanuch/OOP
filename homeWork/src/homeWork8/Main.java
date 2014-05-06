package homeWork8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tish on 06.03.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt"); // файл с текстом находится в корне проекта!
        Scanner scn = new Scanner(file);

//        Line line = new Line();
//        line.output(file, scn);

        Column column = new Column();
        column.output(file, scn);

//        Diagonal diagonal = new Diagonal();
//        diagonal.output(file, scn);
    }
}
