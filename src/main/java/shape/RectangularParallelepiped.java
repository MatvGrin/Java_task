package shape;

public class RectangularParallelepiped {
    private int a;
    private int b;
    private int h;


    public RectangularParallelepiped(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.h = c;
    }

    public RectangularParallelepiped() {
    }

    public int calculateVolume() {
        int V = a * b * h;
        return V;
    }

    public int calculateSquare() {
        int S = 2 * (a * b + a * h + b * h);
        return S;
    }

    public int calculateSquareSide() {
        int S_b = 2 * h + (a + b);
        return S_b;
    }
}
