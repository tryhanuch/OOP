package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tish on 09.03.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);

        Reader.toConsole(file, scanner);

    }
}
