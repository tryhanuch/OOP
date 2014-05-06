package company;

/**
 * Created by tish on 29.01.14.
 */
public class Company {
    String name;
    User[] users;

    public User findMaxUser (){
        User result = users[0];
        for (int i = 1; i < users.length; i++) {
            if (users[i].salary > result.salary){
                result = users[i];
            }
        }
        return result;
    }

    public int numberOfUsers (int from, int to){
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            if (from <= users[i].salary && users[i].salary <= to){
                result ++;
            }
        }
        return result;
    }
}
