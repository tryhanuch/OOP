package lambdA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by tish on 22.03.2014.
 */
public class Main {
    public static void main(String[] args) {
        User u0 = new User(15);
        User u1 = new User(22);
        User u2 = new User(35);
        User u3 = new User(40);
        User u4 = new User(20);
        User u5 = new User(36);

        ArrayList<User> users = new ArrayList<>();
        users.add(u0);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        Collections.sort(users);

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Collections.sort(users, (o1, o2) -> o1.getAge() - o2.getAge());  //Lambda Expressions

    }
}
