package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // It is an in-place algorithm. O(n^2), stable
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
            firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];

            }
            array[i] = newElement;
        }


        printArray(array);
    }


    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
