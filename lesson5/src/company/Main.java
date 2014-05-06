package company;

import java.util.ArrayList;

/**
 * Created by tish on 08.02.14.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> pr0proj = new ArrayList<String>();
        pr0proj.add("Library");
        pr0proj.add("Bank");
        Programmer pr0 = new Programmer("Bill", " Gates", 67, 10000, "C++", pr0proj);

        ArrayList<String> pr1proj = new ArrayList<String>();
        pr1proj.add("Shop");
        pr1proj.add("School");
        Programmer pr1 = new Programmer("John", "Ive", 25, 5000, "Java", pr1proj);

        ArrayList<String> man0Proj = new ArrayList<String>();
        man0Proj.add("Rent");
        man0Proj.add("Buy");
        Manager man0 = new Manager("Steve", "Jobs", 54, 15000, man0Proj);

        ArrayList<String> man1Proj = new ArrayList<String>();
        man1Proj.add("Build");
        man1Proj.add("Destroy");
        Manager man1 = new Manager("Barak", "Obama", 46, 7500, man1Proj);

        Admin ad0 = new Admin("Arthur", "Mench", 22, 100000, 10, "Obolon'", "Linux");
        Admin ad1 = new Admin("Ivan", "Lipsha", 25, 2500, 25, "Rogan'", "WinServer");

        ArrayList<User> users = new ArrayList<User>();
        users.add(pr0);
        users.add(pr1);
        users.add(man0);
        users.add(man1);
        users.add(ad0);
        users.add(ad1);

        Company company = new Company("Luxoft", users);

        company.maxSalary();
    }
}
