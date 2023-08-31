package numb;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {9,2,5,6,8,7,1,4,6,9,3,2,0,5,8};
        Number number = new Number(arr);
        number.minimalElementAmongAllElements();
    }
}
