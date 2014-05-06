package city;

import java.util.ArrayList;

/**
 * Created by tish on 16.02.14.
 */
public class Factory extends Company {
    public Factory(String name, ArrayList<Employee> employees) {
        super(name, employees);
    }

    @Override
    public void reportGen() {
        for (int i = getEmployees().size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (getEmployees().get(j).getSalary() > getEmployees().get(j + 1).getSalary()){
                    Employee temp = getEmployees().get(j);
                    getEmployees().set(j, getEmployees().get(j + 1));
                    getEmployees().set(j + 1, temp);
                }
            }
        }
        System.out.println("Список сотрудников компании "+getName()+" в порядке возрастания з/п:");
        for (int i = 0; i < getEmployees().size(); i++) {
            System.out.println(getEmployees().get(i).getFirstName()+" "+getEmployees().get(i).getSecondName()+" - "+getEmployees().get(i).getSalary());
        }
        System.out.println();
    }
}
