package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by tish on 23.03.2014.
 */
public class Server2 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9090);

        while (true){
            Socket s = ss.accept();
            s.getOutputStream().write("ololo".getBytes());
            s.close();
        }
    }
}
