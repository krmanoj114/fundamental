package predicatedemo;

import java.util.function.Predicate;

public interface Interf {
    public static void main(String[] args) {
        System.out.println("I am static method");
        Predicate<Integer> p = i -> i>10;
        System.out.println("p.test(100) = " + p.test(100));
        System.out.println("p.test(100) = " + p.test(9));
    }
}
