package Interview;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        String primenumber = "";
        //int targetNumber = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target value :");
        int targetNumber = s.nextInt();

        for (i = 0; i < targetNumber; i++) {
            int counter = 0;
            for (j = i; j>=1; j--) {

                if(i%j==0){
                    counter = counter +1;
                }

            }
            if(counter == 2){
                primenumber = primenumber + i +" ";
            }

        }

        System.out.println("primenumber = " + primenumber);

    }
}
