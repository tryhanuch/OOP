package homeWork8;

import java.io.File;
import java.util.Scanner;

/**
 * Created by tish on 02.03.14.
 */
public class Line implements IFormat {
    @Override
    public void output(File file, Scanner scanner) {
        while (scanner.hasNext()){
            String line = scanner.next();
            System.out.print(line + " ");
        }
        System.out.println();
    }
}
