package numb;

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

            System.out.println("startAndEnd -> 1");
            System.out.println("elementsOfArithmeticProgression -> 2");
            System.out.println("elementsOfGeometricProgression -> 3");
            System.out.println("evenAndOddNumbers -> 4");
            System.out.println("minimalElementAmongAllElements -> 5");
            System.out.println("theMinimumOfTheLocalMaxima -> 6");
            System.out.println("get out -> 10");

            System.out.print("Input number metod: ");
            int metod = scanner.nextInt();

            switch (metod){
                case 1: {
                    number.startAndEnd(2,99);
                    break;
                }
                case 2: {
                    System.out.println(number.elementsOfArithmeticProgression());
                    break;
                }
                case 3: {
                    System.out.println(number.elementsOfGeometricProgression());
                    break;
                }
                case 4: {
                    System.out.println(number.evenAndOddNumbers());
                    break;
                }
                case 5: {
                    number.minimalElementAmongAllElements();
                    break;
                }
                case 6: {
                    number.theMinimumOfTheLocalMaxima();
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }
            if (metod == 7){
                break;
            }

        }
    }
}
