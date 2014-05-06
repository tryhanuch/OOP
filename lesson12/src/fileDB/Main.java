package fileDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by tish on 15.03.14.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File fileIn = new File("userIn.txt");
        File fileOut = new File("userOut.txt");
        ArrayList<User> users = new ArrayList<User>();

//        UserLoader.loader(fileIn, users);
//        UserLoader.saver(fileOut, users);

        UserLoader.start(fileIn, fileOut, users);
    }
}
