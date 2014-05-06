package patternMvc;

import java.io.File;
import java.util.Scanner;

/**
 * Created by tish on 15.02.14.
 */
public class Method {
    private File file;
    private Scanner scanner;

    public Method(File file, Scanner scanner) {

        this.file = file;
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public File getFile() {

        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void aVoid(){

        System.out.println("Введите номер метода форматирования (1, 2, 3):");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String e = new String();
        String p = new String();
        while (getScanner().hasNext()){
            String line = getScanner().next();

            if (n == 1){
                System.out.print(line + " ");
            }
            else  if (n == 2){
                System.out.println(line);
            }
            else if (n == 3){
                System.out.println(p+line);
                for (int i = 0; i < line.length(); i++) {
                    p = p + " ";
                }
            }
            else {
                e = "Error!!!";
            }
        }
        System.out.println(e);
    }
}
