package functiondemo;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String s = "Durga Software solution Hydrabad";
        Function<String, String> f = s1 ->s1.replaceAll(" ", "");
        Function<String,Integer> f1 = s1 ->s1.length()- s1.replaceAll(" ", "").length();
        System.out.println("s before replacing = " + s);
        System.out.println("f.apply(s) = " + f.apply(s));
        System.out.println("f1.apply(s) = " + f1.apply(s));

    }
}
