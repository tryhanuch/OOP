package lambdA;

/**
 * Created by tish on 22.03.2014.
 */
public class User implements Comparable<User> {
    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return age - o.getAge();
    }
}
