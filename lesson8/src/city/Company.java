package city;

import java.util.ArrayList;

/**
 * Created by tish on 16.02.14.
 */
public abstract class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public abstract void reportGen();

    public int maxSalary(){
        int max = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > employees.get(max).getSalary())
                max = i;
        }
        return max;
    }

    public int minSalary(){
        int min = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() < employees.get(min).getSalary())
                min = i;
        }
        return min;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
