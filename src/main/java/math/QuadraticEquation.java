package math;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double calculateDiscriminant(){
        return b*b - 4*a*c;
    }

    public Roots getEquationRoots(){
        double discriminant = calculateDiscriminant();
        if (discriminant >= 0){
            double x1 = (-b + sqrt(discriminant)) / (2*a);
            double x2 =(-b - sqrt(discriminant)) / (2*a);
            return new Roots(x1, x2);
        }
        return null;
    }

}
