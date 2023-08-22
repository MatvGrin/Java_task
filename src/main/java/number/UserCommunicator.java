package number;

import java.util.Objects;
import java.util.Scanner;

public class UserCommunicator {
    private static final Scanner scanner = new Scanner(System.in);
    public void run(){
        while (true) {
        System.out.print("Input quantity number: ");
        int kapasiti = scanner.nextInt();
        int[] numbers = new int[kapasiti];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input numbers " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        Calk calk = new Calk(numbers);

        System.out.println("evenAndOdd -> 1");
        System.out.println("biggestAndSmallest -> 2");
        System.out.println("divisibleBy3Or9 -> 3");
        System.out.println("threeDigit -> 4");
        System.out.println("primeNumbers -> 5");
        System.out.println("ascendingAndDescendingOrder -> 6");
        System.out.println("isPalindrome -> 7");
        System.out.println("shortestAndLongestNumber -> 8");
        System.out.println("ascendingAndDescendingLong -> 9");
        System.out.println("Out -> 10");

            System.out.print("\nInput number metod: ");
            int metod = scanner.nextInt();

            switch (metod) {
                case 1: {
                    calk.evenAndOdd();
                    break;
                }
                case 2: {
                    calk.biggestAndSmallest();
                    break;
                }
                case 3: {
                    calk.divisibleBy3Or9();
                    break;
                }
                case 4: {
                    calk.threeDigit();
                    break;
                }
                case 5: {
                    calk.primeNumbers();
                    break;
                }
                case 6: {
                    calk.ascendingAndDescendingOrder();
                    break;
                }
                case 7: {
                    calk.isPalindrome();
                    break;
                }
                case 8: {
                    calk.shortestAndLongestNumber();
                    break;
                }
                case 9: {
                    calk.ascendingAndDescendingLong();
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }
            if (metod == 10){
                break;
            }
        }

    }
}
