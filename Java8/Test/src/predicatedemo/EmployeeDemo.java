package predicatedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1001, "Manoj", "CEO", 50000, "Delhi"));
        emps.add(new Employee(1002, "Sunny", "Manager", 150000, "Bangalore"));
        emps.add(new Employee(1003, "Shreya", "Doctor", 250000, "Hydrabad"));
        emps.add(new Employee(1004, "Annaya", "Architect", 350000, "Pune"));
        emps.add(new Employee(1005, "Sunita", "Officer", 50000, "Madras"));
        emps.add(new Employee(1006, "Sabita", "Manager", 51000, "Bangalore"));

        //System.out.println("emps = " + emps);

        Predicate<Employee> p = e -> e.getDesignation().equals("Manager");
        Predicate<Employee> city = e -> e.getCity().equals("Bangalore");
        Predicate<Employee> salary = e -> e.getSalary() < 200000;
        System.out.println("########to check manager #########");
        Display(p, emps);
        Display(city, emps);
        Display(salary, emps);
        System.out.println("########to check manager from Delhi#########");
        Display(p.and(city), emps); // to check manager from Delhi
        System.out.println("########to check manager having salary less than 200000#########");
        Display(p.or(salary), emps); // to check manager from Delhi
        System.out.println("########to check not manager #########");
        Display(p.negate(), emps);
    }

    private static void Display(Predicate<Employee> p, List<Employee> emps) {
        for (Employee e: emps){
            if(p.test(e)){
                System.out.println("e = " + e);
            }
        }
    }
}
