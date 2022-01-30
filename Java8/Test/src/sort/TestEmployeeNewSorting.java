package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static sort.Employee.sortByEmoloyeeAge;
import static sort.Employee.sortByEmployeeName;

public class TestEmployeeNewSorting {
    public static void main(String[] args) {
        ArrayList<EmployeeNew> empList = new ArrayList<>();
        empList.add(new EmployeeNew("Mohan", 25, 70001));
        empList.add(new EmployeeNew("Sohan", 40, 70009));
        empList.add(new EmployeeNew("Rohan", 25, 60001));
        empList.add(new EmployeeNew("Lakshman", 38, 69901));
        empList.add(new EmployeeNew("Kamal", 25, 50001));
        empList.add(new EmployeeNew("Jeevan", 38, 90001));
        System.out.println("Before sorting");
        empList.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+"Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));


        //sort by java8
        System.out.println("After sorting By emp age");
        List<EmployeeNew> collect = empList.stream().sorted((e1, e2)-> e1.getAge()-(e2.getAge())).collect(Collectors.toList());

        collect.forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+"Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));


        //sort by java8 another way by age
        List<EmployeeNew> collect1 = empList.stream()
                .sorted(Comparator.comparingInt(EmployeeNew::getAge).reversed()).collect(Collectors.toList());
        System.out.println("sort by age another way by age >>>>>>>>>>>>>>>>>>>>>");
        collect1.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+" Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

        List<EmployeeNew> collect2 = empList.stream()
                .sorted(Comparator.comparing(EmployeeNew::getEmployeeName)).collect(Collectors.toList());
        System.out.println("sort by age another way by name >>>>>>>>>>>>>>>>>>>>>");
        collect2.stream().forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+" Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

        //sort by name, if name is equal than sort by name
        System.out.println("sort by name, if name is equal than sort by name >>>>>>>>>>>>>>>>>>>>>");
        List<EmployeeNew> collect3 = empList.stream().sorted((e5, e6) -> {
            if (e5.getAge() == e6.getAge()) {
                return e5.getEmployeeName().compareTo(e6.getEmployeeName());
            } else if (e5.getAge() > e6.getAge())
                return 1;
            else
                return -1;
        }).collect(Collectors.toList());
        collect3.forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+" Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));


        //sort by name, if name is equal than sort by name
        System.out.println("sort by name, if name is equal than sort by name ###############");
        List<EmployeeNew> collect4 = empList.stream().sorted(new Comparator<EmployeeNew>() {
            @Override
            public int compare(EmployeeNew o1, EmployeeNew o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getEmployeeName().compareTo(o2.getEmployeeName());
                } else if (o1.getAge() > o2.getAge())
                    return 1;
                else
                    return -1;
            }
        }).collect(Collectors.toList());
        collect4.forEach(i -> System.out.println("Employee No::"+i.getEmployeeNo()+" Employee Name::"+i.getEmployeeName()+"Employee Age::"+i.getAge()));

    }


}
