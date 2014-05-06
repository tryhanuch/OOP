package homeWork8;

import java.io.File;
import java.util.Scanner;

/**
 * Created by tish on 02.03.14.
 */
public class Diagonal implements IFormat {
    @Override
    public void output(File file, Scanner scanner) {
        String p = new String();
        while (scanner.hasNext()){
            String line = scanner.next();
            System.out.println(p+line);
            for (int i = 0; i < line.length(); i++) {
                p = p + " ";
            }
        }
        System.out.println();
    }
}
