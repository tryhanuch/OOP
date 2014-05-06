package sortComparator;

import java.util.Comparator;

/**
 * Created by tish on 09.03.14.
 */
public class MyComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
