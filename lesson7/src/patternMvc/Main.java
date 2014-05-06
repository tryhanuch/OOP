package patternMvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tish on 15.02.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("file.txt");

        Scanner scn = new Scanner(file);

        Method method = new Method(file, scn);
        method.aVoid();

    }
}
