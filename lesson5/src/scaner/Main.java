package scaner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//* <p>As another example, this code allows <code>long</code> types to be
//        * assigned from entries in a file <code>myNumbers</code>:
//        * <blockquote><pre>
//        *      Scanner sc = new Scanner(new File("myNumbers"));
//        *      while (sc.hasNextLong()) {
//        *          long aLong = sc.nextLong();
//        *
/**
 * Created by tish on 08.02.14.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        FileReader in = new FileReader("file.txt");
//        System.out.println(in.read());

        FileWriter fw = new FileWriter("file.txt");
        fw.write("push'");
    }
}
