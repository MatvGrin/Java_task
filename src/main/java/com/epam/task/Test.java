package com.epam.task;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i=1;
//        while (scan.hasNext()) {
//            String input = scan.nextLine();
//            System.out.println(i + " " + input);
//            i++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int inp1 = scanner.nextInt();
//        int inp2 = scanner.nextInt();
//        if (inp1 > 0 && inp2 > 0) {
//            System.out.println(inp1 * inp2);
//        } else {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }

        Scanner scanner = new Scanner(System.in);//Java Currency Formatter
        double payment = scanner.nextDouble();
        scanner.close();

        String c = "￥";
        String f = "€";

        System.out.println("US: "+ "$" + (int)(payment/1000) + "," + (int)(payment%1000) + "." + (int)((payment*100)%100));
        System.out.println("India: Rs." + (int)(payment/1000) + "," + (int)(payment%1000) + "." + (int)(payment*100%100));
        System.out.println("China: " + c + (int)(payment/1000) + "," + (int)(payment%1000) + "." + (int)(payment*100%100));
        System.out.println("France: " + (int)(payment/1000) + " " + (int)(payment%1000) + "," + (int)(payment*100%100) + " " + f);


    }
}
