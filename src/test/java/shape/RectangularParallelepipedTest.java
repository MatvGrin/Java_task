package shape;

import math.QuadraticEquation;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangularParallelepipedTest {
    private RectangularParallelepiped ctoron;
    @Test
    public void calculateVolume() {
        ctoron = new RectangularParallelepiped(3,2,2);
        int res = ctoron.calculateVolume();
        assertEquals(12, res);
    }

    @Test
    public void calculateSquare() {
        ctoron = new RectangularParallelepiped(3,2,2);
        int res = ctoron.calculateSquare();
        assertEquals(32, res);
    }

    @Test
    public void calculateSquareSide() {
        ctoron = new RectangularParallelepiped(3,2,2);
        int res = ctoron.calculateSquareSide();
        assertEquals(20, res);
    }
}