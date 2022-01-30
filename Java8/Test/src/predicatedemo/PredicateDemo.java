package predicatedemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

        public static void main(String[] args) {
            System.out.println("I am testing predicate function");
            System.out.println("##########################################");
            Predicate<Integer> p = i -> i>10;
            System.out.println("p.test(100) = " + p.test(100));
            System.out.println("p.test(100) = " + p.test(9));
            System.out.println("##########################################");
            Predicate<String> p1 = s -> s.length()>10;
            System.out.println("p1.test('Mango') = " + p1.test("Mango"));
            System.out.println("##########################################");
            Predicate<Collection> p2 = c -> c.isEmpty();
            List<String> l = new ArrayList<>();
            l.add("Ananya");
            l.add("Shreya");
            System.out.println("p2.test(l) = " + p2.test(l));
            System.out.println("p2.test(new ArrayList()) = " + p2.test(new ArrayList()));
            System.out.println("##########################################:Predicate Joining");
            //negate(), and(), or() are default method inside Predicate
            int[] x = {0, 5, 10, 15, 20, 25, 30};
            Predicate<Integer> p3 = i -> i>10;
            Predicate<Integer> p4 = i -> i%2==0;
            System.out.println("Numbers greater than 10 are ");
            m1(p3,x);
            System.out.println("Even numbers are ");
            m1(p4, x);
            System.out.println("The numbers not greater than 10 are ");
            m1(p3.negate(), x);
            System.out.println("the numbers greater than 10 and even are ");
            m1(p3.and(p4),x);
            System.out.println("the numbers greater than 10 or even are ");
            m1(p3.or(p4),x);

            System.out.println("##########################################");
            String[] name ={"Mohan", "Mahesh", "Siksha", "Diksha"};
            Predicate<String> startWithM = s -> s.charAt(0)=='M';
            for (String s: name){
                if(startWithM.test(s)){
                    System.out.println("startWithM = " + s);
                }
            }
            Predicate<String> p5 = s -> s != null && s.length() !=0;





        }

    private static void m1(Predicate<Integer> p3, int[] x) {
            for (int x1:x){
                if(p3.test(x1)){
                    System.out.println(x1);
                }
            }
            
    }

}
