package com.company;

public class Main {

    public static void main(String[] args) {
	    // Array is not dynamic, thus we need to define the size
        // and we cannot change it later.
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // When we have the index, the lookup in the array is O(1)
        // because we can just add the index to the memory address location
        // and get the location

        int index = -1;
        for(int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
            if(intArray[i] == 7) {
                index = i;
                break;
            }
        }

        // When we don't know the index, the lookup in the array is O(n)
        // because in the worst case we need to iterate through the entire
        // array
        System.out.println("Index = " + index);
    }
}
