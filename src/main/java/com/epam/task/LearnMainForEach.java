package com.epam.task;

import java.util.Scanner;

public class LearnMainForEach {
//    public static void main(String[] args) {
//        String[] strArray = new String[] {"One", "Two", "Three"};
//        strArray[2] = null;
//        for (String val : strArray)
//            System.out.print(val + ", ");

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = scan.nextLine();
            scan.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
//        }
    }
}
