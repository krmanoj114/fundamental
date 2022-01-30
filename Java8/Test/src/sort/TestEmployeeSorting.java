package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static sort.Employee.sortByEmoloyeeAge;
import static sort.Employee.sortByEmployeeName;

public class TestEmployeeSorting {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Mohan", 45, 70001));
        empList.add(new Employee("Sohan", 40, 70009));
        empList.add(new Employee("Rohan", 35, 60001));
        empList.add(new Employee("Lakshman", 38, 69901));
        empList.add(new Employee("Kamal", 25, 50001));
        empList.add(new Employee("Jeevan", 38, 90001));
        System.out.println("Before sorting");
        empList.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+"Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

        Collections.sort(empList, sortByEmployeeName);

        System.out.println("After sorting by Name");
        empList.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+"Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

        Collections.sort(empList, sortByEmoloyeeAge);

        System.out.println("After sorting By Age");
        empList.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+"Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

        //sort by java8
        List<Employee> collect = empList.stream()
                .sorted((emp1, emp2) -> emp1.getEmployeeName().compareTo(emp2.getEmployeeName()))
                .collect(Collectors.toList());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        collect.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+" Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

        //sort by java8
       /* List<Employee> collect1 = empList.stream()
                .sorted((emp3, emp4)-> -(emp3.getAge().compareTo(emp4.getAge())))
                .collect(Collectors.toList());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        collect1.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+" Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));
*/

    }


}
