package numb;

import numbers.Number;

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
            numbers.Number number = new Number(numbers);

            System.out.println("startAndEnd -> 1");
            System.out.println(" -> 2");

            System.out.println("get out -> 9");

            System.out.print("Input number metod: ");
            int metod = scanner.nextInt();

            switch (metod){
                case 1: {
//                    number.startAndEnd();
                    break;
                }
                case 2: {
//                    number.();
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }
            if (metod == 9){
                break;
            }

        }
    }
}
