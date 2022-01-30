package methodreference;

public class ConstRefDemo {
    public static void main(String[] args) {
        ConstRefInterf i = () -> {Sample s = new Sample("Me"); return s;};
        System.out.println("i.get().name = " + i.get().name);

        // Cunstructor Ref without parameter
        ConstRefInterf ref = Sample::new;
        System.out.println("ref.get().name = " + ref.get().name);

        // Cunstructor Ref with parameter
        ConstRefInterfParametrized refWithName = Sample::new;
        System.out.println("ref.get().name = " + refWithName.get("Manoj").name);
    }
}
