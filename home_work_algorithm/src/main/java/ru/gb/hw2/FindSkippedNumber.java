package ru.gb.hw2;

public class FindSkippedNumber {

    public static void main(String[] args) {
        //---------Подзадача №1--------------//
        //---------Подзадача №2--------------//
        int[] firstArr = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16}; // => 11
        int[] secondArr = {1, 2, 4, 5, 6};                                    // => 3
        int[] thirdArr = {2, 3, 4, 5, 6, 7, 8};                               // => 1
        int[] fourthArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};    // => 15
        int[] fifthArr = {};                                                  // => 1

        System.out.println(findNumber(firstArr));
        System.out.println(findNumber(secondArr));
        System.out.println(findNumber(thirdArr));
        System.out.println(findNumber(fourthArr));
        System.out.println(findNumber(fifthArr));
    }

    public static int findNumber(int[] arr){
        for (int i = arr.length+1; i > 0 ; i--) {
            if (arr.length!=0){
                if (!isNumberInArray(i, arr))
                return i;
            }else{
                return 1;
            }
        }
        return 0;
    }

    public static boolean isNumberInArray(int searchNumber, int[] array){
        int start = 0;
        int end = array.length-1;
        int mid;

        while (true) {
            mid = (start+end)/2;
            int num = array[mid];
            if (searchNumber == num) {
                return true;
            } else if (start > end) {
                return false;
            } else {
                if (searchNumber < num) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
    }
}
