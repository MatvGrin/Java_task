package light;

public class TrafficLight {
    private boolean redState = false;
    private boolean yellowState = false;
    private boolean greenState = false;

    public void turnOnRedLight() {
        greenState = false;
        yellowState = false;
        redState = true;
    }

    public void turnOnYellowLight() {
        greenState = false;
        yellowState = true;
        redState = false;
    }

    public void turnOnGreenLight() {
        greenState = true;
        yellowState = false;
        redState = false;
    }

    public void showLight() {
        if (redState) {
            System.out.println("Red Light");
        }else if (yellowState) {
            System.out.println("Yellow Light");
        }else if (greenState) {
            System.out.println("Green Light");
        }
    }

}
