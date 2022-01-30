package predicatedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SoftwareEngineerDemo {
    public static void main(String[] args) {
        Predicate<SofwareEngineer> allowed = s -> s.isHavingGirlFriend() && s.getAge()>18 ;

    List<SofwareEngineer> engineer = new ArrayList<>();
        engineer.add(new SofwareEngineer(17, "Rohan", true));
        engineer.add(new SofwareEngineer(22, "Sohan", false));
        engineer.add(new SofwareEngineer(16, "Mamta", true));
        engineer.add(new SofwareEngineer(25, "Nitesh", false));
        engineer.add(new SofwareEngineer(22, "RohLokhanan", true));

        for (SofwareEngineer e: engineer){
            if(allowed.test(e)){
                System.out.println("e = " + e);

            }
        }


    }
}
