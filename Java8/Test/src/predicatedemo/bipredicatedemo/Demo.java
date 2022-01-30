package predicatedemo.bipredicatedemo;

import java.util.function.BiPredicate;

public class Demo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (a,b) -> (a+b)%2==0;
        System.out.println("bp.test(8,12) = " + bp.test(8,12));
        System.out.println("bp.test(13,12) = " + bp.test(13,12));
    }
}
