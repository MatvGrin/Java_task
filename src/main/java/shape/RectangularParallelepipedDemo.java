package shape;

public class RectangularParallelepipedDemo {
    public static void main(String[] args) {
        RectangularParallelepiped rec = new RectangularParallelepiped(3,2,2);

        System.out.println("Volume = " + rec.calculateVolume());
        System.out.println("Square = " + rec.calculateSquare());
        System.out.println("Square side = " + rec.calculateSquareSide());
    }
}
