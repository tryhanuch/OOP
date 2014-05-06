package homeWork2.ex1;

import java.util.ArrayList;

/**
 * Created by tish on 30.01.14.
 * Есть компания и сотрудники. Сотрудник состоит из следующих полей - имя, фамилия, возраст, зп, пол. Компания состоит из следующих полей - список сотрудников(Организовать с помощью класса - ArrayList), название, адрес.
 * В методе мейн организовать следующий алгоритмы -
 *  1. отсортировать женщин по возрасту, а мужчин по зп.
 * 2. вывести всех сотрудников в консоль у которых имя начинается с заданного префикса
 * 3. вывести всех сотрудников в консоль у которых длина фамилии совпадает с заданным числом
 * 4. вывести в консоль отчет следующего содержания:
 *      имя0 - сколько раз повторяется
 *      имя1 - сколько раз повторяется
 * 5. Уволить из компании всех женщин, а мужчинам увеличить зп :)))
 */
public class Main {
    public static void main(String[] args) {

        User user0 = new User("Alex", "Kein", 66, 2350, "male");
        User user1 = new User("Piter", "Pen", 45, 7250, "male");
        User user2 = new User("Lady", "Gaga", 98, 6350, "female");
        User user3 = new User("Quentin", "Tarantino", 21, 3050, "male");
        User user4 = new User("Jim", "Kerry", 38, 5550, "male");
        User user5 = new User("April", "O'Neel", 33, 2500, "female");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        Company company = new Company("Apple", users);

        company.sortAll();

        company.byPrefix();

        company.byLength();

        company.report();

        company.fire();
    }
}
