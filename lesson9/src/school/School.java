package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public class School {
    private String name;
    private ArrayList<SchoolClass> schoolClasses;

    public School(String name, ArrayList<SchoolClass> schoolClasses) {
        this.name = name;
        this.schoolClasses = schoolClasses;
    }

    public void schoolOlevel(){
    int mark = 0;
        for (int i = 0; i < schoolClasses.size(); i++) {
            mark += schoolClasses.get(i).oLevel();
        }
        mark = mark / schoolClasses.size();
        System.out.println("Средняя успеваемость по школе - "+mark+" балл(ов).");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(ArrayList<SchoolClass> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }
}
