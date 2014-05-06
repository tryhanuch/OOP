package city;

import java.util.ArrayList;

/**
 * Created by tish on 16.02.14.
 */
public class City {
    private String name;
    private ArrayList<Company> companies;

    public City(String name, ArrayList<Company> companies) {
        this.name = name;
        this.companies = companies;
    }

    public void reportGen(){
        for (int i = 0; i < companies.size(); i++) {
            companies.get(i).reportGen();
        }
    }

    public void exchange (){
        int max = 0;
        int min = 0;
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getEmployees().get(companies.get(i).maxSalary()).getSalary() >
                    companies.get(max).getEmployees().get(companies.get(max).maxSalary()).getSalary())
                max = i;
            if (companies.get(i).getEmployees().get(companies.get(i).minSalary()).getSalary() <
                    companies.get(min).getEmployees().get(companies.get(min).minSalary()).getSalary())
                min = i;
        }

        Company idMaxComp = getCompanies().get(max);
        Company idMinComp = getCompanies().get(min);
        Employee temp = idMaxComp.getEmployees().get(idMaxComp.maxSalary());
        idMaxComp.getEmployees().set(idMaxComp.maxSalary(), idMinComp.getEmployees().get(idMinComp.minSalary()));
        idMinComp.getEmployees().set(idMinComp.minSalary(), temp);
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.println(companies.get(i).getEmployees().get(j).getFirstName()+" - "
                        +companies.get(i).getEmployees().get(j).getSalary());
            }
            System.out.println();
        }
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }
}
