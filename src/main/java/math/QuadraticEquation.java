package math;

import java.io.InputStream;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private final double discriminant = b*b - 4*a*c;

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
        return discriminant;
    }

    public Object getEquationRoots(){;
        if (discriminant > 0){
            double x1 = (-b + sqrt(discriminant)) / (2*a);
            double x2 =(-b - sqrt(discriminant)) / (2*a);
            return x1 + " "+ x2;
        }else if (discriminant == 0){
            double x = (-b) / (2*a);
            return x;
        } else {
            return null;
        }
    }

}
