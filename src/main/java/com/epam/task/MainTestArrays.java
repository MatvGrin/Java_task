package com.epam.task;

import java.util.Arrays;

public class MainTestArrays {
    public static void main(String[] args) {
        int[] arr = {10, 1, 12, 13};
        int[] arrr = {10, 11, 12, 13};
        System.out.println(Arrays.toString(arr));//toString
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 3)));//copyOf
        System.out.println(Arrays.toString(new boolean[]{Arrays.equals(arr, arrr)}));//equals
        Arrays.sort(arr);//sort
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arrr, 13));//binarySearch
        int[] array = new int[3];//fill
        Arrays.fill(array, -71);
        System.out.println(Arrays.toString(array));

    }

//    public static String myToString(int[] arr){
//        String start = "[";
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            start+= arr[i] + ", ";
//        }
//        start+= arr[arr.length - 1];
//        start += "]";
//
//        return start;
//    }


}
