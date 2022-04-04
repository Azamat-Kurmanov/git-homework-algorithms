package ru.gb.hw2;

import ru.gb.hw2.queue.Queue;
import ru.gb.hw2.queue.QueueImpl;

public class FindSkippedNumber {

    public static void main(String[] args) {
        //---------Подзадача №1------------//
        testQueue();
        //---------Подзадача №2------------//
        System.out.println(findNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16})); // => 11
        System.out.println(findNumber(new int[]{1, 2, 4, 5, 6}));                                     // => 3
        System.out.println(findNumber(new int[]{2, 3, 4, 5, 6, 7, 8}));                               // => 1
        System.out.println(findNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}));     // => 15
        System.out.println(findNumber(new int[]{}));                                                  // => 1
    }

    public static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(7);

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        System.out.println("remove: " + queue.remove());
        System.out.println("remove: " + queue.remove());

        System.out.println("add element: " + queue.insert(15));
        System.out.println("add element: " + queue.insert(18));
        System.out.println("add element: " + queue.insert(11));
        System.out.println("add element: " + queue.insert(13));
        System.out.println("add element: " + queue.insert(7));
        queue.display();
        System.out.println("------------------------------------");
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
