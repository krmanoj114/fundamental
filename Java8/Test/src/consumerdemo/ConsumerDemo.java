package consumerdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Bahubali", "Prabha", "Anushka", "Hit"));
        list.add(new Movie("Sultan", "Salman", "Anushka", "Hit"));
        list.add(new Movie("Bazigar", "Sahrukh", "Kajol", "Hit"));
        list.add(new Movie("Dangal", "Aamir", "Anushka", "Flop"));
        list.add(new Movie("Dil", "Aamir", "Madhuri", "flop"));

        Consumer<Movie> c = movie -> {
            System.out.println("movie name = " + movie.getName());
            System.out.println("movie.getHero() = " + movie.getHero());
            System.out.println("movie.getHeroiene() = " + movie.getHeroiene());
            System.out.println();
        };

        Consumer<Movie> c1 = movie -> System.out.println("movie  " + movie.getName()+"is ready to release");
        Consumer<Movie> c2 = movie -> System.out.println("movie  " + movie.getName()+"is just released and it is " +movie.getResult());
        Consumer<Movie> c3 = movie -> System.out.println("movie  " + movie.getName()+" information storing into database");
        Consumer<Movie> chainC = c1.andThen(c2).andThen(c3);
        for (Movie m: list){
            chainC.accept(m);
        }


        List<Student> students = new ArrayList<>();
        students.add(new Student("Mahesh", 85));
        students.add(new Student("Nagesh", 65));
        students.add(new Student("Vimlesh", 55));
        students.add(new Student("Mohan", 75));
        students.add(new Student("Nitish", 45));
        students.add(new Student("Rohan", 95));

        for (Movie m:list){
            c.accept(m);
        }

        Predicate<Student> p = student -> student.getMarks()>60;
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
        Consumer<Student> display = student -> {
            System.out.println("student.getName() = " + student.getName());
            System.out.println("student.getMarks() = " + student.getMarks());
            System.out.println("student = " +f.apply(student));
            System.out.println();
        };
        for (Student s:students){
            if(p.test(s))
            display.accept(s);
        }
    }
}
