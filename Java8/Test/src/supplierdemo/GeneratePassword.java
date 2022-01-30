package supplierdemo;

import java.util.function.Supplier;

public class GeneratePassword {
    public static void main(String[] args) {

        Supplier<String> s = ()->{
            String password="";
            Supplier<Integer> s1 = () -> (int)(Math.random()*10);
            String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> s2= () -> symbol.charAt((int)(Math.random()*29));
            for (int i = 0; i < 8; i++) {
                if(i%2==0){
                    password = password+s1.get();
                }else{
                    password = password + s2.get();
                }

            }
            return password;
        };

        System.out.println("s.get() = " + s.get());
        System.out.println("s.get() = " + s.get());
        System.out.println("s.get() = " + s.get());
        System.out.println("s.get() = " + s.get());


    }

}
