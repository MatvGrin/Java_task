package numbers;

import java.util.Arrays;

public class Number {
    private int[] array;


    public Number(int[] array) {
        this.array = array;
    }

    private int numberLength(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public void greaterThanTheAverageLengthAmongAllNumbers(){
        System.out.print("Greater than the average length among all numbers: ");
        int temp = 0;
        for (int i : array) {
            temp += numberLength(i);
        }
        int average = temp / array.length;
        for (int num : array) {
            if (numberLength(num) > average) System.out.println(num);
        }
    }

    boolean isDifferentDigit(int num){
        int[] arr = new int[numberLength(num)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i] + 1) return false;
        }
        return true;
    }

    public void diffNumbers(){
        for (int i : array) {
            if (isDifferentDigit(i)){
                System.out.println(i);
                return ;
            }
        }
    }


    public void isPalindrome(){
        System.out.print("Palindrome is: ");
        int counter = 0;
        for (int values : array) {
            int temp = values;
            int rez = 0;
            while (temp > 0) {
                int dig = temp % 10;
                rez = rez * 10 + dig;
                temp /= 10;
            }
            if (values == rez){
                counter++;
                if (counter == 2) System.out.println(values);
            }
        }
    }

    private boolean even(int number) {
//        int[] arr = new int[numberLength(number)];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = number % 10;
//            number /= 10;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1){
//                return false;
//            }
//        }
//
        while (number > 0){
            int temp = number % 10 ;
            if (temp % 2 == 1) return false;
            number /= 10;
        }
        return true;
    }

    public void allNumbersAreEven(){
        System.out.print("All numbers are even: ");
        for (int i : array) {
            if (even(i)) System.out.println(i + " ");
        }
    }

    private boolean growth(int num){
        int[] arr = new int[numberLength(num)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public void numbersInWhichAreInStrictAscendingOrder(){
        System.out.print("Numbers in which are in strict ascending order: ");
        int counter = 0;
        for (int i : array) {
            if (growth(i)) {
                counter++;
                if (counter == 2){
                    System.out.print(i);
                } else if(counter == 1) System.out.print(i);
            }
        }
    }

    public void moreThanItsRightHandNeighbor(){
        System.out.print("More than its right-hand neighbor: ");
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                counter++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("\nQuantity: " + counter);
    }

    public void positiveAndNegativeNumbers(){
        System.out.print("Positive and negative numbers: ");
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 1){
                temp++;
            }else {
                temp = 0;
            }
        }
        System.out.println(temp);
    }

    public void theProductOfAllOneDigitAndTwoDigitNumberSandTheSumOfAllOthers(){
        System.out.print("The product of all one digit and two digit number sand the sum of all others: ");
        int temp1 = 1;
        int temp2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1 && array[i] <= 99){
                temp1 *= array[i];
            }
            if (array[i] >= 100){
                temp2 += array[i];
            }
        }
        System.out.print("Multiplication: " + temp1);
        System.out.print("Summa: " + temp2);
    }
}
