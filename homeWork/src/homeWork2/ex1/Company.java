package homeWork2.ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 30.01.14.
 */
public class Company {
    private String name;
    private ArrayList<User> users;

    public Company(String name, ArrayList<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public User sortByAge (){
        User result = users.get(0);
        for (int i = users.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users.get(j).getAge() > users.get(j + 1).getAge()){
                    User temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                }
            }
        }
        return result;
    }

    public User sortBySalary (){
        User result = users.get(0);
        for (int i = users.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users.get(j).getSalary() > users.get(j + 1).getSalary()){
                    User temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                }
            }
        }
        return result;
    }

    public void sortAll (){
        sortBySalary();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getGender().equals("male")){
                System.out.println(users.get(i).getFirstName()+" "+users.get(i).getSecondName()+" - "+users.get(i).getAge()+" "+users.get(i).getSalary());
            }
        }
        System.out.println();

        sortByAge();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getGender().equals("female")){
                System.out.println(users.get(i).getFirstName()+" "+users.get(i).getSecondName()+" - "+users.get(i).getAge()+" "+users.get(i).getSalary());
            }
        }
        System.out.println();
    }

    public void byPrefix(){
        Scanner prefixIn = new Scanner(System.in);
        System.out.println("Введите первые буквы имени для поиска, начиная с большой:");
        String prefix = prefixIn.nextLine();
        int x = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFirstName().startsWith(prefix)){
                x++;
                System.out.println(users.get(i).getFirstName()+" "+users.get(i).getSecondName());
            }
        }
        System.out.println("Найдено сотрудников - "+x);
        System.out.println();
    }

    public void byLength (){
        Scanner numberIn = new Scanner(System.in);
        System.out.println("Введите число длины фамилии для поиска:");
        int number = numberIn.nextInt();
        int x = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getSecondName().length() == number){
                x++;
                System.out.println(users.get(i).getFirstName()+" "+users.get(i).getSecondName());
            }
        }
        System.out.println("Найдено сотрудников - "+x);
        System.out.println();
    }

    public void report (){
        System.out.println("Отчет:");
        System.out.println("Имя   Кол-во");
        for (int i = 0; i < users.size(); i++) {
            int amt = 0;
            for (int j = 0; j < users.size(); j++) {
                if (users.get(i).getFirstName().equals(users.get(j).getFirstName())){
                    amt++;
                }
            }
            System.out.println(users.get(i).getFirstName()+" "+amt);
        }
        System.out.println();
    }

    public void fire(){
        System.out.println("Увольняем из компании всех женщин, а мужчинам увеличиваем зп на 300!");
        ArrayList<User> fire = new ArrayList<User>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getGender().equals("male")){
                users.get(i).setSalary(users.get(i).getSalary() + 300);
                fire.add(users.get(i));
            }
        }
        for (int i = 0; i < fire.size(); i++) {
            System.out.println(fire.get(i).getFirstName()+" "+fire.get(i).getSecondName()+" - "+fire.get(i).getSalary());
        }
        System.out.println();
    }
}
