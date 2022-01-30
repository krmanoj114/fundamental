package methodreference;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        Interf interf = MethodReferenceDemo::m4;  //Static reference
        Interf interf1 = methodReferenceDemo::m5; //Non-static reference
        interf.m1();
        interf.m2();
        Interf.m3();
        interf1.m1();

    }
    public static void m4(){
        System.out.println("I am being reference by m1 abstract method");
    }

    public  void m5(){
        System.out.println("I am m5 being reference by m1 abstract method");
    }
}
