package light;

public class Demo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        System.out.println(lamp.isLight());
        lamp.showLampState();

        lamp.switchOn();
        System.out.println(lamp.isLight());
        lamp.showLampState();

        lamp.switchOff();
        System.out.println(lamp.isLight());
        lamp.showLampState();
    }
}
