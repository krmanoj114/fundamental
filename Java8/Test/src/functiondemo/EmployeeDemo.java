package functiondemo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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

            System.out.println("emps = " + emps);

            //Getting total salary of employee
            Function<List<Employee>, Object> f = list->{
                Double totalSalary =0.0;
                for (Employee emp:list){
                    totalSalary = totalSalary+ emp.getSalary();
                }
                return totalSalary;
            };
            System.out.println("totalSalary = "+f.apply(emps));

            //Increasing salary of employee by 477 for those having less than 50000

            //Identify the employee having salary less than 50000
            Predicate<Employee> p = e->e.getSalary()<100000;

            //Increase salary by 477
            Function<Employee, Employee> increment = e->{
                e.setSalary(e.getSalary()+477);
                return e;
            };
            for (Employee e:emps){
                if(p.test(e)){
                    increment.apply(e);
                    System.out.println("Employee after salary increment  = " + e);
                }
            }



            //Function chaining

            Function<String,String> f1=s->s.toUpperCase();
            Function<String,String> f2= s->s.substring(0,9);
            System.out.println("The Result of f1:"+f1.apply("AishwaryaAbhi"));
            System.out.println("The Result of f2:"+f2.apply("AishwaryaAbhi"));
            System.out.println("The Result of f1.andThen(f2):"+f1.andThen(f2).apply("AishwaryaAbhi"));
            System.out.println("The Result of f1.compose(f2):"+f1.compose(f2).apply("AishwaryaAbhi"));


            Function<Integer,Integer> f3= i->i+i;
            Function<Integer,Integer> f4= i->i*i*i;
            System.out.println(f3.andThen(f4).apply(2));
            System.out.println(f3.compose(f4).apply(2));


        }


    }
