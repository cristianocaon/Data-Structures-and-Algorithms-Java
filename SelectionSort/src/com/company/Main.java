package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] array = {20, 35, -15, 7, 55, 1, -22};

	    // O(n^2) and in-place sorting algorithm. Unstable sort
	    for(int i = array.length - 1; i > 0; i--) {
            int largest = 0;

            for(int j = 1; j <= i; j++) {
	            if(array[largest] < array[j]) {
	                largest = j;
                }
            }
            swap(array, largest, i);
        }

	    printArray(array);
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
