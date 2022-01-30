package methodreference;

public class TestWithMethodReference {
    public static void main(String[] args) {

        TestWithMethodReference testWithMethodReference = new TestWithMethodReference();
        Runnable runnable = testWithMethodReference::m1;  //method reference
        new Thread(runnable).start();

        //Main part
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
    }
    public void m1(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Child Thread "+i);

        }
    }
}
