package sort;

import java.util.Comparator;

public class Employee {
    private String employeeName;
    private int age;
    private int employeeNo;

    public Employee(String employeeName, int age, int employeeNo) {
        this.employeeName = employeeName;
        this.age = age;
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public static Comparator<Employee> sortByEmployeeName = new Comparator<Employee>(){
        public int compare(Employee e1, Employee e2){
            return e1.getEmployeeName().compareTo(e2.getEmployeeName());
        }
    };
    public static Comparator<Employee> sortByEmoloyeeAge = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getAge() - o2.getAge();
        }
    };
}
