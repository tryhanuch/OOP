package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by tish on 09.02.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        File f = new File("file.txt");

        Scanner scn = new Scanner(f);
        int count = 0;
        while (scn.hasNextLine()){
            String line = scn.nextLine();
            String[] strs = line.split(" ");
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].equals(word)){
                    count += 1;
                }
            }
        }
        System.out.println(count);
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
}
