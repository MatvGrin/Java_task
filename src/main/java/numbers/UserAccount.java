package numbers;

import java.util.Scanner;

public class UserAccount {
    private static final Scanner scanner = new Scanner(System.in);
    public void run(){
        while (true){
            System.out.print("\nInput quantity number: ");
            int kapasiti = scanner.nextInt();
            int[] numbers = new int[kapasiti];

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Input numbers " + i + ": ");
                numbers[i] = scanner.nextInt();
            }
            Number number = new Number(numbers);

            System.out.println("greaterThanTheAverageLengthAmongAllNumbers -> 1");
            System.out.println("diffNumbers -> 2");
            System.out.println("isPalindrome -> 3");
            System.out.println("allNumbersAreEven -> 4");
            System.out.println("get out -> 5");

            System.out.print("Input number metod: ");
            int metod = scanner.nextInt();

            switch (metod){
                case 1: {
                    number.greaterThanTheAverageLengthAmongAllNumbers();
                    break;
                }
                case 2: {
                    number.diffNumbers();
                    break;
                }
                case 3: {
                    number.isPalindrome();
                    break;
                }
                case 4: {
                    number.allNumbersAreEven();
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }
            if (metod == 5){
                break;
            }

        }
    }

}
