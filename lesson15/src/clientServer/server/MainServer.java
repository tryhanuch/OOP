package clientServer.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by tish on 23.03.2014.
 */
public class MainServer {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\tish\\IdeaProjects\\OOP\\lesson16\\src\\clientServer\\log.txt");
        Scanner sc = new Scanner(file);
        String s = null;

        while (sc.hasNext()){
            s = sc.next();
            if (s.equals("run")){
                System.out.println("I'm working!");
            }else {
                System.out.println("Stop the program!");
                System.exit(0);
            }
            new Thread(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
