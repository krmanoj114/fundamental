package predicatedemo;

public class Employee {


    int employeId;
    String name;
    String designation;
    double salary;
    String city;

    public Employee(int employeId, String name, String designation, double salary, String city) {
        this.employeId = employeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {

        /*return "predicate.Employee{" +
                "employeId=" + employeId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';*/
        String s = String.format("(%s,%s,%s,%.2f,%s)", employeId, name, designation, salary,city);
        return s;
    }
}
