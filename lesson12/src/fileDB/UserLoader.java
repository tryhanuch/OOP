package fileDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 15.03.14.
 */
public class UserLoader {

    public static void start(File fileIn, File fileOut, ArrayList<User> users) throws IOException {
        System.out.println("Type the command!");
        System.out.println("load - to load from the file.");
        System.out.println("save - to save to the file.");
        System.out.println("exit - to quit the program.");
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        while (true){
            if (cmd.equals("load")){
                UserLoader.loader(fileIn, users);
            }else if (cmd.equals("save")){
                UserLoader.saver(fileOut, users);
            }else if(cmd.equals("exit")){
                System.exit(0);
            }else {
                System.out.println("Invalid command! Please try again.");
            }
        }
    }

    public static void loader(File file, ArrayList<User> users) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String [] us = sc.nextLine().split(":");
            User user = new User(us[0], us[1], Integer.parseInt(us[2]), Integer.parseInt(us[3]));
            users.add(user);
        }
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getFirstName()+" "+users.get(i).getSecondName()+" "+
                    users.get(i).getAge()+" "+users.get(i).getSalary());
        }
    }

    public static void saver(File file, ArrayList<User> users) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        for (int i = 0; i < users.size(); i++) {
            fw.write(users.get(i).getFirstName()+" "+users.get(i).getSecondName()+" "+
                    users.get(i).getAge()+" "+users.get(i).getSalary()+"\n");
        }
        fw.close();
    }
}
