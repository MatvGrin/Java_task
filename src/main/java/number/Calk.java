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

    public void primeNumbers(){
        System.out.print("Prime numbers: ");
        for (int j : array) {
            for(int i = 1; i < j / 2; i++) {
                if(j % i == 0) {
                    System.out.println("");
                }
            }
            System.out.print(j + " ");
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

    }

    public void shortestAndLongestNumber(){

    }

    public void ascendingAndDescendingLong(){

    }
}
