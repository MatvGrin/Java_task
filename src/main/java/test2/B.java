package test2;

class B extends A{


    public B() {
        System.out.println("Constructor B");
    }
    static {
        System.out.println("Static B");
    }

    {
        System.out.println("B");
    }
}
