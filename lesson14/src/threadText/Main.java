package threadText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 22.03.2014.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("file.txt");
        Scanner sc = new Scanner(f);
        ArrayList<String> str = new ArrayList<>();

        while (sc.hasNext()) {
            str.add(sc.next());
        }

        new Thread(() -> {
                for (int i = 0; i < str.size(); i++) {
                    if (str.get(i).startsWith("f")) {
                        System.out.println(str.get(i));
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        }).start();
    }
}
