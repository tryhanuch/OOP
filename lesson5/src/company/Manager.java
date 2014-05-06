package company;

import java.util.ArrayList;

/**
 * Created by tish on 08.02.14.
 */
public class Manager extends User {
    ArrayList<String> manProjects;

    public Manager(String firstName, String lastName, int age, int salary, ArrayList<String> manProjects) {
        super(firstName, lastName, age, salary);
        this.manProjects = manProjects;
    }

    public ArrayList<String> getManProjects() {
        return manProjects;
    }

    public void setManProjects(ArrayList<String> manProjects) {
        this.manProjects = manProjects;
    }
}
