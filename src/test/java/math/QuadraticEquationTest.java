package math;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEquationTest {
    private QuadraticEquation calk;

    @Test
    public void calculateDiscriminant() {
        calk = new QuadraticEquation(1,4,4);
        double res = calk.calculateDiscriminant();
        assertEquals(0, res, 0.0001);
    }

    @Test
    public void getEquationRootsWhenDiscriminantEqualsZero() {
        calk = new QuadraticEquation(1,4,4);
        Roots res = calk.getEquationRoots();
        assertEquals(-2, res.getX1(), 0.0001);
        assertEquals(-2, res.getX2(), 0.0001);
    }

    @Test
    public void getEquationRootsWhenDiscriminantMoreThanZero() {
        calk = new QuadraticEquation(1,5,6);
        Roots res = calk.getEquationRoots();
        assertEquals(-2, res.getX1(), 0.0001);
        assertEquals(-3, res.getX2(), 0.0001);
    }

    @Test
    public void getEquationRootsWhenDiscriminantLaseThanZero() {
        calk = new QuadraticEquation(5,1,1);
        Roots res = calk.getEquationRoots();
        assertNull(res);
    }
}