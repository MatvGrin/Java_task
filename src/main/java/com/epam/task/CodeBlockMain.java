package com.epam.task;

public class CodeBlockMain {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 5;
            a++;
            System.out.println(a);
        }
        if (a == 3) {
            int c = 10;
        } else {
//            c++;
        }
    }
}
