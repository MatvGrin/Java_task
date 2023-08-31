package test;

public class Bird {
    private boolean fly = false;
    private static int age = 8;
    private final int side;
    private static final float p = 3.14f;
    private final Car car = new Car();

    public Bird(int side) {
        this.side = 55;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void sey(){
        final int a = 10;
        System.out.println("Tishina!!!!!!!!!!!!!!!");
        car.setNumOfCars(5);
    }

    public static void isAge(){
        age = 10;
        System.out.println(age);
    }


}
