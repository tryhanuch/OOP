package company;

/**
 * Created by tish on 29.01.14.
 */
public class Main {
    public static void main(String[] args) {
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
        user2.salary = 1200;

        User user3 = new User();
        user3.firstName = "Nik";
        user3.secondName = "Nikov";
        user3.age = 45;
        user3.salary = 500;

        User user4 = new User();
        user4.firstName = "Alex";
        user4.secondName = "Kein";
        user4.age = 34;
        user4.salary = 630;

        User user5 = new User();
        user5.firstName = "John";
        user5.secondName = "Dou";
        user5.age = 56;
        user5.salary = 550;

        User[] users = new User[6];
        users[0] = user0;
        users[1] = user1;
        users[2] = user2;
        users[3] = user3;
        users[4] = user4;
        users[5] = user5;

        Company company = new Company();
        company.name = "FedEx";
        company.users = users;

        int x = company.numberOfUsers(500, 600);
        System.out.println(x);

    }
}
