package user;

/**
 * Created by tish on 25.01.14.
 */
public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
        String[] secondNames = new String[3];
        int [] ages = new int[3];
        int [] salaries = new int[3];

//        names[0] = "Ivan";
//        secondNames[0] = "Ivanov";
//        ages[0] = 17;
//        salaries[0] = 200;
//
//        names[1] = "Petr";
//        secondNames[1] = "Petrov";
//        ages[1] = 30;
//        salaries[1] = 300;
//
//        names[2] = "Sidor";
//        secondNames[2] = "Sidorov";
//        ages[2] = 23;
//        salaries[2] = 500;

        User user0 = new User();
        user0.firstName = "Ivan";
        user0.secondName = "Ivanov";
        user0.age = 17;
        user0.salary = 200;

        User user1 = new User();
        user1.firstName = "Petr";
        user1.secondName = "Petrov";
        user1.age = 30;
        user1.salary = 300;

        User user2 = new User();
        user2.firstName = "Sidor";
        user2.secondName = "Sidorov";
        user2.age = 23;
        user2.salary = 850;

        User user3 = new User();
        user3.firstName = "Nik";
        user3.secondName = "Nikov";
        user3.age = 45;
        user3.salary = 500;

        User[] users = new User[4];
        users[0] = user0;
        users[1] = user1;
        users[2] = user2;
        users[3] = user3;

//
//        for (int i = 0; i < users.length; i++) {
//            System.out.println(users[i].firstName);
//        }

        int iMax = 0;
        for (int i = 1; i < users.length; i++) {
            if (users[i].salary > users[iMax].salary) {
                iMax = i;
            }
        }
        System.out.println(users[iMax].firstName);

        int iMin = 1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].salary < users[iMin].salary){
                iMin = i;
            }
        }
        System.out.println(users[iMin].firstName);

        // Замена юзеров местеми
        User temp = users[iMax];
        users[iMax] = users[iMin];
        users[iMin] = temp;

        System.out.println(users[iMax].firstName);
        System.out.println(users[iMin].firstName);




    }
}
