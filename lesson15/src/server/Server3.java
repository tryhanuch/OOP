package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by tish on 23.03.2014.
 */
public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        while (true) {
            Socket s = ss.accept();
            final Scanner sc = new Scanner(s.getInputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = sc.nextLine();
                        System.out.println(str);
                    }
                }
            }).start();
        }
    }
}
