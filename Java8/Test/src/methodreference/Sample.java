package methodreference;

public class Sample {
    String name;

    public Sample(String name) {
        this.name = name;
        System.out.println("Parametrized Constructor");

    }

    public Sample() {
        System.out.println("Empty Constructor");
    }
}
