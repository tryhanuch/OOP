package company;

import java.util.ArrayList;

/**
 * Created by tish on 08.02.14.
 */
public class Programmer extends User {
    String progLang;
    ArrayList<String> progProjects;

    public Programmer(String firstName, String lastName, int age, int salary, String progLang, ArrayList<String> projects) {
        super(firstName, lastName, age, salary);
        this.progLang = progLang;
        this.progProjects = projects;
    }

    public String getProgLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public ArrayList<String> getProgProjects() {
        return progProjects;
    }

    public void setProgProjects(ArrayList<String> progProjects) {
        this.progProjects = progProjects;
    }
}
