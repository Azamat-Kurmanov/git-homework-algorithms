package lesson2;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.setNumberOfElements(10);
        int[] arr = simpleArray.getSimpleArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j>0 && arr[j]>=temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
