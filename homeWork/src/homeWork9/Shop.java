package homeWork9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 12.03.14.
 */
public class Shop implements ICommand{
//    private String name;
//    private ArrayList<Goods> goodses;
//
//    public Shop(String name, ArrayList<Goods> goodses) {
//        this.name = name;
//        this.goodses = goodses;
//    }

    public static void work() throws FileNotFoundException {
        ArrayList<Goods> goodses = new ArrayList<Goods>();

        Scanner scm = new Scanner(new File("mobilePhones.txt"));
        Scanner scn = new Scanner(new File("notebooks.txt"));
        Scanner scp = new Scanner(new File("printers.txt"));

        while (scm.hasNextLine()){

        }







        System.out.println("Type |-help| for help.");
        System.out.println("Type your command:");
        Scanner scs = new Scanner(System.in);

    }

    @Override
    public void help() {
        System.out.println("All commands:");
        System.out.println("|-price| load and view all information in console.");
        System.out.println("|-cart| see all goods in the user cart.");
        System.out.println("|-buy<id>| load goods from file by id and pass it to the cart.");
        System.out.println("|-commit| generate purchase report to the console and file.");
        System.out.println("|-clean| clean all goods from cart.");
        System.out.println("|-exit| to exit.");
    }

    @Override
    public void price() {

    }

    @Override
    public void basket() {

    }

    @Override
    public void buy(int id) {

    }

    @Override
    public void commit() {

    }

    @Override
    public void clean() {

    }

    @Override
    public void exit() {

    }

//    public String getName() {
//
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public ArrayList<Goods> getGoodses() {
//        return goodses;
//    }
//
//    public void setGoodses(ArrayList<Goods> goodses) {
//        this.goodses = goodses;
//    }
}
