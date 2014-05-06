package reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 09.03.14.
 */
public class Reader {

    public static void toConsole(File file, Scanner scanner){
        ArrayList<String> text = new ArrayList<String>();
        while (scanner.hasNext()){
            text.add(scanner.next());
        }
        for (int i = 0; i < text.size(); i++) {
            System.out.println(text.get(i));
        }
    }
}
