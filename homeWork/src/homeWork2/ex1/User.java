package homeWork2.ex1;

/**
 * Created by tish on 30.01.14.
 */
public class User {
    private String firstName;
    private String secondName;
    private int age;
    private int salary;
    private String gender;

    public User(String firstName, String secondName, int age, int salary, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}