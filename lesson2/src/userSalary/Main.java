package userSalary;

/**
 * Created by tish on 29.01.14.
 */
public class Main {
    public static void main(String[] args) {
        User u0 = new User();
        u0.firstName = "Alex";
        u0.secondName = "Kein";
        int[] sels = {200, 700, 2000};
        u0.salarys = sels;
        int ma = u0.avarageSalary();
        System.out.println(ma);


        u0.avarageSalary();
    }
}
