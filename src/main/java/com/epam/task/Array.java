package com.epam.task;

public class Array {
    public static void main(String[] args) {
        int[] numberArray = new int[10];
        int i = 0;
        while (i < 10) {
            numberArray[i] = i;
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println((i+1) + "-й элемент массива = " +  numberArray[i]);
            i++;
        }

        int[] array;// не має різниці;
        int a[];
        int[] array1 = {12, 58, 98, 8};
        int b[] = new int[10];
        String str [] = new String[10];
        int p[] = new int[]{1, 2, 3, 4};

    }
}
