package methodreference;

public interface Interf {
    public void m1();
    default void m2(){
        System.out.println("I am default method");
    }
    static void m3(){
        System.out.println("I am static method");
    }
}
