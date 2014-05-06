package iTerator;

import multi.C;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by tish on 30.03.2014.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<C> cs = new LinkedList<>();

        Iterator<C> iter = cs.iterator();
        while (iter.hasNext()){
            C element = iter.next();
            System.out.println(element);
        }
    }
}
