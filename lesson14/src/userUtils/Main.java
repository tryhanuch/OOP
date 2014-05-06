package userUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by tish on 22.03.2014.
 */
public class Main {
    public static void main(String[] args) {
        User u0 = new User("Alex", 16, 2500);
        User u1 = new User("Fred", 28, 1500);
        User u2 = new User("Bob", 23, 3500);
        User u3 = new User("John", 40, 500);
        User u4 = new User("Meggy", 35, 5500);

        LinkedList<User> u = new LinkedList<>();
        u.add(u0);
        u.add(u1);
        u.add(u2);
        u.add(u3);
        u.add(u4);

        List<User> r0 = UserUtils.byAge(u, 24);
        for (User user : r0) {
            System.out.println(user.getName());
        }


        List<User> r1 = UserUtils.findUsers(u, new Criteria() {
            @Override
            public boolean check(User user) {
                return user.getAge() == user.getSalary();
            }
        });

        List<User> r2 = UserUtils.findUsers(u, user -> user.getAge() == user.getSalary()); //Lambda Expressions
                                    // Элементами u являются user и к ним применяется условие после стрелки





    }
}
