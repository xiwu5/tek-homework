package com.perscholas.java_basics;
import java.util.Arrays; // For Question 3

public class ArrayPractice {
    public static void main(String[] Strings) {
        // Question 1
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Question 1:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + " is " + array[i]);
        }

        // Question 2
        System.out.println("\nQuestion 2:");
        int[] nums = {13, 5, 7, 68, 2};

        int middleIndex = nums.length / 2;

        // If the length is odd
        if (nums.length % 2 == 1) {
            System.out.println("Middle element for {13, 5, 7, 68, 2}is " + nums[middleIndex]);
        }
        // If the length is even
        else {
            System.out.println("Middle element is  " + nums[middleIndex - 1]);
        }

        // Question 3
        System.out.println("\nQuestion 3:");
        String[] originalArray = {"red", "green", "blue", "yellow"};

        System.out.println("Original array length is " + originalArray.length);

        // Make a copy
        String[] copiedArray = originalArray.clone();
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Question 4
        System.out.println("\nQuestion 4:");
        int[] myArray = {1, 2, 3, 4, 5};

        // Print out the value at the first index
        System.out.println("Value at the first index: " + myArray[0]);

        // Print the value at the last index using length - 1
        System.out.println("Value at the last index: " + myArray[myArray.length - 1]);

        try {
            System.out.println("Value at index = length: " + myArray[myArray.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            myArray[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught while assigning value to index 5: " + e);
        }

        // Question 5
        System.out.println("\nQuestion 5:");
        int[] arr = new int[5];

        // Assign array values by index
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println("Array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        // Question 6
        System.out.println("\nQuestion 6:");

        int[] arr2 = new int[5];

        // Assign array values by index * 2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 2;
        }

        System.out.println("Array values:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Index " + i + ": " + arr2[i]);
        }

        // Question 7
        System.out.println("\nQuestion 7:");
        int[] arr7 = {1, 2, 3, 4, 5};

        // Print the value of each element except for the middle element
        for (int i = 0; i < arr7.length; i++) {
            // Skip print
            if (i == 2) {
                continue;
            }
            System.out.println("Value at index " + i + ": " + arr7[i]);
        }





    }
}
