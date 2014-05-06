package userSalary;

/**
 * Created by tish on 29.01.14.
 */
public class User {
    String firstName;
    String secondName;
    int[] salarys;

    public int avarageSalary (){
        int sum = 0;
        for (int i = 0; i < salarys.length; i++) {
            sum += salarys[i];
        }
        return sum / salarys.length;
    }
}
