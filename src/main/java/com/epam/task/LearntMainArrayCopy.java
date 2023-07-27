package com.epam.task;

import java.util.Arrays;

public class LearntMainArrayCopy {
    public static void main(String[] args) {
        int[]array = {1,2,3,78};
        int[] hold = {12,11,10,9,8,7};
        System.arraycopy(array,0,hold,2,2);
        System.out.println(Arrays.toString(hold));

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
