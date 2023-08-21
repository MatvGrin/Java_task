package shape;

public class RectangularParallelepiped {
    private final int a;
    private final int b;
    private final int h;


    public RectangularParallelepiped(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.h = c;
    }

    public int calculateVolume() {
        int volume = a * b * h;
        return volume;
    }

    public int calculateSquare() {
        int square = 2 * (a * b + a * h + b * h);
        return square;
    }

    public int calculateSquareSide() {
        int sideSquare = 2 * h + (a + b);
        return sideSquare;
    }
}
