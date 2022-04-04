package lesson2;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.setNumberOfElements(10);
        int[] arr = simpleArray.getSimpleArray();
        System.out.println(Arrays.toString(arr));

        int limit = arr.length;
        do {
            limit--;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        } while(limit>0);

        System.out.println(Arrays.toString(arr));
    }

}
