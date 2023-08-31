package test2;

public class C extends B{

    public C() {
        System.out.println("Constructor: C");
    }

    static {
        System.out.println("Static C");
    }

    {
        System.out.println("C");
    }
}
