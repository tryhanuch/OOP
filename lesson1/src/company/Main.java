package company;

/**
 * Created by tish on 25.01.14.
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

        User[] users0 = new User[1];
        users0[0] = user0;

        User[] users1 = new User[2];
        users1[0] = user1;
        users1[1] = user2;

        User[] users2 = new User[3];
        users2[0] = user3;
        users2[1] = user4;
        users2[2] = user5;

        Company company0 = new Company();
        company0.name = "FedEx";
        company0.users = users0;

        Company company1 = new Company();
        company1.name = "DHL";
        company1.users = users1;

        Company company2 = new Company();
        company2.name = "Укрпошта";
        company2.users = users2;

        Company[] companies = new Company[3];
        companies[0] = company0;
        companies[1] = company1;
        companies[2] = company2;

// Вывод на экран названия компании и колечества работников в ней
        for (int i = 0; i < companies.length; i++) {
            System.out.println(companies[i].name+" - "+companies[i].users.length);
        }
        System.out.println();

// Вывод на экран названия компании и суммы з/п всех сотрудников компании
        for (int i = 0; i < companies.length; i++) {
            int sum = 0;
            for (int j = 0; j < companies[i].users.length; j++) {
                sum = sum + companies[i].users[j].salary;
            }
            companies[i].salarySum = sum;
            System.out.println(companies[i].name+" - "+companies[i].salarySum);
        }
        System.out.println();

// Вывод на экран компании в с найбольшей суммой з/п всех сотрудников
        int sumMax = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].salarySum > companies[sumMax].salarySum) {
                sumMax = i;
            }
        }
        System.out.println(companies[sumMax].name+" - "+companies[sumMax].salarySum);
    }
}
