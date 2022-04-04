package ru.gb.hw1;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {14, 17, 30, 6, 18, 16, 5, 13, 8, 15, 7, 1, 12, 3, 2, 9, 4, 10, 22, 21, 19, 11, 20, 29, 24, 26, 25, 28, 23, 27};
        System.out.println(Arrays.toString(array));

        int min, max;
        for (int i = 0; i < array.length-1; i++) {
            min = i;
            max = (array.length-1)-i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[min]){
                    min = j;
                }
            }
            for (int j = (array.length-2)-i; j >= 0 ; j--) {
                if (array[j]>array[max]){
                    max = j;
                }
            }
                int temp = array[i];
                int temp2 = array[(array.length-1)-i];

                array[i] = array[min];
                array[(array.length-1)-i] = array[max];

                array[min] = temp;
                array[max] = temp2;
        }
        System.out.println(Arrays.toString(array));
    }
}
