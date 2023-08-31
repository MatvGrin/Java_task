package test2;


public class A {

    public A() {
        System.out.println("Constructor A");
    }

    static {
        System.out.println("Static A");
    }

    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a1 = new C();
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);
        System.out.println(a1 instanceof C);
    }
}
