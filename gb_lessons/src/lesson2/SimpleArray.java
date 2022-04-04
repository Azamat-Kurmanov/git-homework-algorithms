package lesson2;

import java.util.Random;

public class SimpleArray {
    private int numberOfElements;

    public SimpleArray(){}

    public int[] getSimpleArray() {
        int[] simpleArr = new int[numberOfElements];
        for (int i = 0; i <= simpleArr.length-1; i++) {
            Random random = new Random();
            int rand = random.nextInt(numberOfElements);
            simpleArr[i] = rand;
        }
        return simpleArr;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

}
