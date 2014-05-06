package human;

/**
 * Created by tish on 29.01.14.
 */
public class Main {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.alcoState);
// Вызов метода
        boolean t = u.makeDrink(200);
        System.out.println(t);
        System.out.println(u.alcoState);
    }
}
