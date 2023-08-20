package light;

public class Lamp {
    private boolean state = false;

    public void switchOn() {
        state = true;
    }

    public void switchOff() {
        state = false;
    }

    public boolean isLight() {
        return state;
    }

    public void showLampState() {
        if (state) {
            System.out.println("Lamp is working");
        } else {
            System.out.println("Lamp is not working");
        }
    }
}
