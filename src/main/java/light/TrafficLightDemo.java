package light;

public class TrafficLightDemo {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight();

        while (true){
            trafficLight.turnOnRedLight();
            trafficLight.showLight();
            Thread.sleep(1000);

            trafficLight.turnOnYellowLight();
            trafficLight.showLight();
            Thread.sleep(1000);

            trafficLight.turnOnGreenLight();
            trafficLight.showLight();
            Thread.sleep(1000);
        }
    }
}
