package math;

public class QuadraticEquationDemo {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2,14,8);

        double rez = quadraticEquation.calculateDiscriminant();
        System.out.println(rez);

        Roots res = quadraticEquation.getEquationRoots();
        System.out.println(res.getX1());
        System.out.println(res.getX2());
    }
}
