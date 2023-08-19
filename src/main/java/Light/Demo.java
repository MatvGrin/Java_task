package Light;

public class Demo {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();

        lamp1.switchOn();
        lamp1.switchOff();
        lamp1.isLight();
        lamp1.showLampState();
        System.out.println(lamp1);
    }
}
