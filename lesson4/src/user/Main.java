package user;

import java.util.ArrayList;

/**
 * Created by tish on 02.02.14.
 */
public class Main {
    public static void main(String[] args) {

        User u0 = new User("Alex", 2500);
        User u1 = new User("Pit", 3500);
        User u2 = new User("Max", 1500);
        User u3 = new User("Nik", 3300);
        User u4 = new User("Tom", 1000);

        ArrayList<User> users = new ArrayList<User>();
        users.add(u0);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        int iMax = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(iMax).getSalary() < users.get(i).getSalary()){
                iMax = i;
            }
        }

        System.out.println(users.get(iMax).getName()+" "+users.get(iMax).getSalary());
    }
}
