package company;

import java.util.ArrayList;

/**
 * Created by tish on 08.02.14.
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

    public void maxSalary(){
        int max = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getSalary() >= users.get(max).getSalary()){
                max = i;
            }
        }
        System.out.println(users.get(max).firstName+" "+users.get(max).lastName+" - "+users.get(max).getSalary());
    }
}
