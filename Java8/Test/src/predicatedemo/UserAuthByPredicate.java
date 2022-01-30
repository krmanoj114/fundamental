package predicatedemo;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserAuthByPredicate {
    public static void main(String[] args) {

        Predicate<User> p = user->user.getUserName().equals("durga") && user.getPassword().equals("java");
        Function<String, String> f = u -> u.substring(0,5);
        Function<String, String> f1 = u -> u.toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = sc.next();
        System.out.println("Enter password");
        String passsword = sc.next();
        User user = new User(userName, passsword);

        /*if(p.test(user)){
            System.out.println(" Valid user" );
        } else{
            System.out.println("Please login again" );
        }*/
        if(f.andThen(f1).apply(user.getUserName()).equals("durga") && user.getPassword().equals("password") ){
            System.out.println(" Valid user" );
        } else{
            System.out.println("Please login again" );
        }


    }
}
