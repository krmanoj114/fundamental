package functiondemo.bifunctiondemo;

import functiondemo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Demo {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> bf = (a,b) ->a*b;
        System.out.println("bf.apply(5,6) = " + bf.apply(5,6));
        System.out.println("bf.apply(5,6) = " + bf.apply(15,15));

        //Creating Student object with BiFunction
        BiFunction<String,Integer,Student> bf1 = (a,b)-> new Student(a,b);

        List<Student> students = new ArrayList<>();
        students.add(bf1.apply("Mahesh", 85));
        students.add(bf1.apply("Nagesh", 65));
        students.add(bf1.apply("Vimlesh", 55));
        students.add(bf1.apply("Mohan", 75));
        students.add(bf1.apply("Nitish", 45));
        students.add(bf1.apply("Rohan", 95));

        System.out.println("students = " + students);

    }

}
