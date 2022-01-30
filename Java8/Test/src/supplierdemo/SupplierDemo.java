package supplierdemo;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {


        Supplier<String> s = ()->{
            String[] name ={"Mohan", "Rohan", "Sohan", "Rohan"};
            int x = (int)(Math.random()*4);
            return name[x];
        };

        System.out.println("s.get() = " + s.get());

        Supplier<Date> s1=()->new Date();
        System.out.println(s1.get());

        Supplier<String> otps=()->{
            String otp="";
            for(int i =1;i<=6;i++) {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(otps.get());
        System.out.println(otps.get());
        System.out.println(otps.get());
    }
}
