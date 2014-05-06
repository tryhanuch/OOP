package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by tish on 23.03.2014.
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
       new Thread(()->{
           ServerSocket ss = null;
           try {
               ss = new ServerSocket(9090);
               Socket s = ss.accept();
               //wrap input stream to scanner
               Scanner sc = new Scanner(s.getInputStream());
               while (sc.hasNextLine()) {
                   String str = sc.nextLine();
                   System.out.println(str);
                   if ("exit".equals(str)) {
                       System.exit(0);
                   }
               }
           } catch (IOException e) {
               e.printStackTrace();
           }

       }).start();
        new Thread(()->{
            while (true){
                System.out.println("Run");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
