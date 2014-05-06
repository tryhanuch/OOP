package userUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tish on 22.03.2014.
 */
public class UserUtils {
    public static List<User> findUsers(List<User> list, Criteria c){
        LinkedList<User> result = new LinkedList<User>();

        for(User user : list)
            if (c.check(user))
                result.add(user);

        return result;
    }

    public static List<User> byName (List<User> list, String name){
        LinkedList<User> result = new LinkedList<User>();
        for (User user : list)
            if (user.getName().equals(name))
                result.add(user);
        return result;
    }

    public static List<User> byAge (List<User> list, int a){
        LinkedList<User> result = new LinkedList<User>();;
        for (User user : list)
            if (user.getAge() > a)
                result.add(user);
        return result;
    }

    public static List<User> bySalary (List<User> list, int a, int b){
        List<User> result = new LinkedList<User>();;
        for (User user : list)
            if (user.getSalary() < a && user.getSalary() > b)
                result.add(user);
        return result;
    }

    public static List<User> byAgwSalary (List<User> list){
        List<User> result = new LinkedList<User>();;
        for (User user : list)
            if (user.getAge() == user.getSalary())
                result.add(user);
        return result;
    }
}
