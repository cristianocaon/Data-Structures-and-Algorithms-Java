package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

	    // O(n^2)
        for(int i = intArray.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
        }

        printArray(intArray);
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
