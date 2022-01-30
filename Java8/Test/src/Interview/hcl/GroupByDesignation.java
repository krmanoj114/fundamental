package Interview.hcl;

import functiondemo.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDesignation {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new functiondemo.Employee(1001, "Manoj", "CEO", 50000, "Delhi"));
        emps.add(new functiondemo.Employee(1002, "Sunny", "Manager", 150000, "Bangalore"));
        emps.add(new functiondemo.Employee(1003, "Shreya", "Doctor", 250000, "Hydrabad"));
        emps.add(new functiondemo.Employee(1004, "Annaya", "Architect", 350000, "Pune"));
        emps.add(new functiondemo.Employee(1005, "Sunita", "Officer", 50000, "Madras"));
        emps.add(new Employee(1012, "Sabita", "Manager", 51000, "Bangalore"));
        emps.add(new functiondemo.Employee(1006, "Sunny1", "Manager", 150000, "Bangalore"));
        emps.add(new functiondemo.Employee(1007, "Sunny2", "Manager", 150000, "Bangalore"));
        emps.add(new functiondemo.Employee(1008, "Sunny3", "Manager", 150000, "Bangalore"));
        emps.add(new functiondemo.Employee(1009, "Annaya1", "Architect", 350000, "Pune"));
        emps.add(new functiondemo.Employee(1010, "Annaya2", "Architect", 350000, "Pune"));
        emps.add(new functiondemo.Employee(1011, "Annaya3", "Architect", 350000, "Pune"));


        //System.out.println("emps = " + emps);
        //Java 8 way of group by
        Map<String, List<Employee>> collect = emps.stream()
                .collect(Collectors.groupingBy(e -> e.getDesignation(), Collectors.toList()));

        System.out.println(">:" + collect);

        //Java 7
        Set<String> designations = new HashSet<String>();
        Map<String, List<Employee>> finalDesignation = new HashMap<>();
        for (Employee emp : emps) {
            designations.add(emp.getDesignation());
            finalDesignation.put(emp.getDesignation(), new ArrayList<Employee>());
        }
        for (Employee employee : emps) {
            for (String uniqueDesignation : designations) {
                if (uniqueDesignation.equals(employee.getDesignation())) {
                    List<Employee> employees = finalDesignation.get(employee.getDesignation());
                    employees.add(employee);
                }
            }
        }
        //System.out.println("finalDesignation:" + finalDesignation.toString());
        //System.out.println("finalDesignation.entrySet:" + finalDesignation.entrySet());
        //System.out.println("finalDesignation.keySet:" + finalDesignation.keySet());


        for(Map.Entry<String, List<Employee>> entry: finalDesignation.entrySet()){
            System.out.println("key:"+entry.getKey());
            System.out.println("value:"+entry.getValue());
            System.out.println(">>>>"+finalDesignation.get(entry.getKey()));


        }

    }
}