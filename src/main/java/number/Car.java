package number;

public class Car {

    private Kuzov kuzov;
    private Koleso koleso;

//    public Car() {
//        this.kuzov = new Kuzov();
//        this.koleso = new Koleso();
//    }

    public Car(Kuzov kuzov, Koleso koleso) {
        this.kuzov = kuzov;
        this.koleso = koleso;
    }

    public void constractAuto() {
        System.out.println("Add kuzov" + kuzov);
        System.out.println("Add koleso" + koleso);
    }

    public static void main(String[] args) {
        Kuzov kuzov1 = new Kuzov();
        Koleso koleso1 = new Koleso();
        Car car = new Car(kuzov1, koleso1);
        car.constractAuto();

    }
}
