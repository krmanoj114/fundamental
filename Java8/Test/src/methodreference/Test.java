package methodreference;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 10 ; i++) {
                System.out.println("Child Thread "+i);

            }
        };
        new Thread(runnable).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
    }
}
