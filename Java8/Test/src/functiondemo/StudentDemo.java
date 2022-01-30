package functiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mahesh", 85));
        students.add(new Student("Nagesh", 65));
        students.add(new Student("Vimlesh", 55));
        students.add(new Student("Mohan", 75));
        students.add(new Student("Nitish", 45));
        students.add(new Student("Rohan", 95));

        Function<Student, String> f = student -> {
            if (student.getMarks() >= 80) {
                return "A[Distinction]";
            } else if (student.getMarks() >= 60) {
                return "B [First Division]";
            } else if (student.getMarks() >= 50) {
                return "C [Second Divistion]";
            } else if (student.getMarks() > 45) {
                return "D [Third Division]";
            } else {
                return "Failed";
            }
        };
        Predicate<Student> p = s->s.getMarks()>=80;
        for (Student s: students){
            if(p.test(s)){
                System.out.println("Student Name = " + s.getName());
                System.out.println("Student Marks = " + s.getMarks());
                System.out.println("Student Grade = " + f.apply(s));
                System.out.println("###############################");
            }

            }
        }

    }

