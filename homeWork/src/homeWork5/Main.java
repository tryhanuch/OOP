package homeWork5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tish on 11.02.14.
 * Есть текстовый файл с строками, словами.
 * Используя сканер, вывести в консоль самое длинное слово.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();

        File f = new File("file.txt");
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        Scanner scn = new Scanner(f);

        String maxWord = null;
        while (scn.hasNextLine()){
            int max = 0;
            String line = scn.nextLine();
            String [] strs = line.split(" ");
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() > strs[max].length()){
                    max = i;
                }
            }
            maxWord = strs[max];
        }
        System.out.println(maxWord);
    }
}
