package city;

import java.util.ArrayList;

/**
 * Created by tish on 16.02.14.
 */
public class Shop extends Company {
    public Shop(String name, ArrayList<Employee> employees) {
        super(name, employees);
    }

    @Override
    public void reportGen() {
        System.out.println("Список сотрудников компании "+getName()+" в рандомном порядке:");
        for (int i = 0; i < getEmployees().size(); i++) {
            System.out.println("Рандомно:)");
        }
        System.out.println();
    }
}
