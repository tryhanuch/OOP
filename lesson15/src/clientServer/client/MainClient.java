package clientServer.client;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by tish on 23.03.2014.
 */
public class MainClient {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\tish\\IdeaProjects\\OOP\\lesson16\\src\\clientServer\\log.txt");
        fw.write("stop");
        fw.close();
    }
}
