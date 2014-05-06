package sortComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by tish on 09.03.14.
 */
public class Main {
    public static void main(String[] args) {
        User u0 = new User(15);
        User u1 = new User(22);
        User u2 = new User(35);
        User u3 = new User(40);
        User u4 = new User(20);
        User u5 = new User(36);

        ArrayList<User> users = new ArrayList<User>();
        users.add(u0);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

//        Collections.sortComparator(users, new MyComparator()); // Класс MyComparator имплементирует
                                                                 // интерфейс Comparator<User>
                                                                 // и реализовывает его метод compare.

//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getAge());
//        }

//        Collections.sort(users, new Comparator<User>() {    // Инерный анонимный класс (класс MyComparator не создаем)
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(users);                        // Класс User имплементирует интерфейс Comparable<User>
                                                        // и реализовывает его метод compareTo.
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getAge());
        }
    }
}
