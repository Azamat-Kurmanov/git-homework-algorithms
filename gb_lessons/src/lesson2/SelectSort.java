package lesson2;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.setNumberOfElements(10);
        int[] arr = simpleArray.getSimpleArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
