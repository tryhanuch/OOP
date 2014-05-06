package city;

import java.util.ArrayList;

/**
 * Created by tish on 16.02.14.
 */
public class Main {
    public static void main(String[] args) {

        Employee e0 = new Employee("Alex", "Kein", 66, 2350);
        Employee e1 = new Employee("Piter", "Pen", 45, 7250);
        Employee e2 = new Employee("Lady", "Gaga", 98, 6350);
        Employee e3 = new Employee("Jim", "Kerry", 38, 5550);
        Employee e4 = new Employee("Quentin", "Tarantino", 21, 3050);
        Employee e5 = new Employee("April", "O'Neel", 33, 2500);

        Employee a0 = new Employee("Frank", "Sinatra", 66, 2250);
        Employee a1 = new Employee("Klark", "Kent", 45, 7350);
        Employee a2 = new Employee("Lady", "Gaga", 98, 6350);
        Employee a3 = new Employee("Jim", "Kerry", 38, 5550);
        Employee a4 = new Employee("Quentin", "Tarantino", 21, 3050);
        Employee a5 = new Employee("April", "O'Neel", 33, 2500);

        Employee b0 = new Employee("John", "Dou", 66, 2150);
        Employee b1 = new Employee("Robin", "Good", 45, 7150);
        Employee b2 = new Employee("Lady", "Gaga", 98, 6350);
        Employee b3 = new Employee("Jim", "Kerry", 38, 5550);
        Employee b4 = new Employee("Quentin", "Tarantino", 21, 3050);
        Employee b5 = new Employee("April", "O'Neel", 33, 2500);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(e0);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        ArrayList<Employee> employeesa = new ArrayList<Employee>();
        employeesa.add(a0);
        employeesa.add(a1);
        employeesa.add(a2);
        employeesa.add(a3);
        employeesa.add(a4);
        employeesa.add(a5);

        ArrayList<Employee> employeesb = new ArrayList<Employee>();
        employeesb.add(b0);
        employeesb.add(b1);
        employeesb.add(b2);
        employeesb.add(b3);
        employeesb.add(b4);
        employeesb.add(b5);

        Company c0 = new Bank("Alfa Bank", employees);
        Company c1 = new Factory("Roshen", employeesa);
        Company c2 = new Shop("Novus", employeesb);

        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(c0);
        companies.add(c1);
        companies.add(c2);

        City city = new City("Kiev", companies);
        city.reportGen();
        city.exchange();
    }
}
