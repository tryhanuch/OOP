package swingDB2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 16.03.14.
 */
public class ReadWrite {
    public static ArrayList<String> read() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("db2.txt"));
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

    public static void write(String fn, String sn, int salary, int age, boolean b){
        FileWriter fw;
        try {
            fw = new FileWriter("db2.txt", b);
            fw.write(fn+" "+sn+" "+salary+" "+age+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
