package math;

public class QuadraticEquationDemo {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2,14,8);
        System.out.println(quadraticEquation.calculateDiscriminant());
        System.out.println(quadraticEquation.getEquationRoots());
    }
}
