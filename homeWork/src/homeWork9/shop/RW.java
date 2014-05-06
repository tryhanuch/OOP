package homeWork9.shop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 20.03.14.
 */
public class RW {
    public static ArrayList<String> readFrom(File file){
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }
        ArrayList<String> str = new ArrayList<String>();

        while (sc.hasNextLine()){
            str.add(sc.nextLine());
        }
        return str;
    }

    public static void writeTo(String fn, String sn, int salary, int age, File file, boolean b){
        FileWriter fw;
        try {
            fw = new FileWriter(file, b);
            fw.write(fn+":"+sn+":"+salary+":"+age+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
