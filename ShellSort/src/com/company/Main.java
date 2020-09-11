package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // Variation of Insertion Sort.
        // Insertion sort chooses which element to insert using
        // a gap of 1.
        // Shell Sort starts out using a larger gap value.
        // As the algorithm runs, the gap is reduced.
        // Goal is to reduce the amount of shifting required.

        // A famous technique to reduce the interval is the Knuth Sequence.
        // (3^k - 1) / 2
        // k -> length of array

        // However, we'll use a simpler approach for demonstration purpose.
        // We'll only divide the gap by 2 -> k / 2, until we reach gap of 1,
        // and thus perform an Insertion Sort in the last step.

        // It is an in-place algorithm. Worst case O(n^2), but it can
        // perform much better than that.

        // It is unstable algorithm.

        for(int gap = array.length / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;

                while(j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }

        printArray(array);

    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
