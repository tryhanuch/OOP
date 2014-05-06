package human;

/**
 * Created by tish on 15.02.14.
 */
public class Worker extends Human {
    private int salary;
    private String staff;

//    public Worker(String name, int pulse, int salary, String staff) {
//        super(name, pulse);
//        this.salary = salary;
//        this.staff = staff;
//    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }
}
