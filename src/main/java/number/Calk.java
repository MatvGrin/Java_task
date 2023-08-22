package number;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Calk {
    private int[] array;

    public Calk(int[] array) {
        this.array = array;
    }

    public void evenAndOdd(){
        System.out.print("Even: ");
        for (int i : array) {
            if (i % 2 == 0 && i >=0){
                System.out.print(i + " ");
            }
        }
        System.out.print("\nOdd: ");
        for (int i : array) {
            if (i % 2 == 1){
                System.out.print(i + " " );
            }
        }
    }

    public void biggestAndSmallest(){
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("The Biggest: " + min);
        System.out.println("The Smallest: " + max);
    }

    public void divisibleBy3Or9(){
        System.out.print("Divisible by 3: ");
        for (int i : array) {
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDivisible by 9: ");
        for (int i : array) {
            if (i % 9 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public void threeDigit(){
        System.out.print("Three digit: " );
        for (int i : array) {
            int three = i % 100;
            int two = i / 10 % 10;
            int one = i / 100;
            if (i >= 100 && i<= 999 && one != two && two != three && one != three){
                System.out.print(i + " ");
            }
        }
    }

    public void primeNumbers(){////
        System.out.print("Prime numbers: ");
        for (int num : array) {
            int counter = 0;
            if (num > 2 && num % 2 == 0) continue;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) counter++;
            }
            if (counter == 0) {
                System.out.print(num + " ");
            }
        }
    }


    public void ascendingAndDescendingOrder(){
        System.out.print("Ascending order: ");
        Arrays.sort(array);
        for (int values : array) {
            System.out.print(values + " ");
        }
        System.out.print("\nDescending order: ");
        int[] sorted = Arrays.stream(array).sorted().toArray();
        int[] reversesorted = IntStream.rangeClosed(1, sorted.length).map(i -> sorted[sorted.length-i]).toArray();
        System.out.println(Arrays.toString(reversesorted));
    }

    public void isPalindrome(){
        System.out.println("Palindrome: ");
        for (int values : array) {
            int temp = values;
            int rez = 0;
            while (temp > 0) {
                int dig = temp % 10;
                rez = rez * 10 + dig;
                temp /= 10;
            }
            if (values == rez){
                System.out.println(values + " ");
            }
        }
    }

    public void shortestAndLongestNumber(){ // 123   3695     25   9
        int sh = numberLength(array[0]);  // 3
        int lo = numberLength(array[0]);   // 3
        int shNum = array[0];         // 123
        int loNum = array[0];         // 123
        for (int i = 1; i < array.length; i++) {
            int len = numberLength(array[i]); // 4
            if (len > lo) {
                lo = len;
                loNum = array[i];
            }
            if (len < lo) {
                sh = len;
                shNum = array[i];
            }
        }
        System.out.println("Shortest number: " + shNum + " length: " + sh);
        System.out.println("Longest number: " + loNum + " length: " + lo);

    }

    private int numberLength(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public void ascendingAndDescendingLong(){

    }
}
