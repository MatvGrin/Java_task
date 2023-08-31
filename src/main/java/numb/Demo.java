package numb;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6,4};
        Number number = new Number(arr);
        number.theMinimumOfTheLocalMaxima();
    }
}
