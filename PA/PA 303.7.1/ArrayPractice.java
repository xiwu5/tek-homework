package com.perscholas.java_basics;
import java.util.Arrays; // For Question 3
import java.util.Scanner; // For Question 11

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

        // Question 8
        System.out.println("\nQuestion 8:");

        String[] arr8 = {"a", "b", "c", "d", "e"};
        int target = arr8.length / 2;
        String temp = arr8[0];
        arr8[0] = arr8[target];
        arr8[target] = temp;

        // Print the modified array to verify
        for (String element : arr8) {
            System.out.println(element);
        }

        // Question 9
        System.out.println("\nQuestion 9:");

        int[] arr9 = {4, 2, 9, 13, 1, 0};

        // Sort the array
        Arrays.sort(arr9);

        System.out.print("Array in ascending order: ");
        for (int i = 0; i < arr9.length; i++) {
            System.out.print(arr9[i]);
            if (i < arr9.length - 1) {
                System.out.print(", "); // Format the output
            }
        }
        System.out.println();
        System.out.println("The smallest number is " + array[0]); // First elemenet = smallest element
        System.out.println("The biggest number is " + array[array.length - 1]);// Last element = biggest element

        // Question 10
        System.out.println("\nQuestion 10:");
        Object[] arr10 = {1, "a", "b", "c", 1.1};

        System.out.print("Mixed array: [");
        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i]);
            if (i < arr10.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Question 11
        System.out.println("\nQuestion 11:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many favorite things do you have? ");
        int numThings = scanner.nextInt();
        scanner.nextLine();

        String[] res = new String[numThings]; // The new String array's size = user input number

        // Use for loop to prompt user to enter "numThings" times
        for (int i = 0; i < numThings; i++) {
            System.out.print("Enter your thing: ");
            res[i] = scanner.nextLine();
        }

        // Print out the contents of the array
        System.out.println("Your favorite things are:");
        for (String thing : res) {
            System.out.print(thing + " ");
        }

        scanner.close();

    }
}

/*
Output:
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=54117:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/xiwu/Desktop/tek_java/out/production/tek_java com.perscholas.java_basics.ArrayPractice
Question 1:
Element at index 0 is 1
Element at index 1 is 2
Element at index 2 is 3

Question 2:
Middle element for {13, 5, 7, 68, 2}is 7

Question 3:
Original array length is 4
Copied array: [red, green, blue, yellow]

Question 4:
Value at the first index: 1
Value at the last index: 5
Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
Exception caught while assigning value to index 5: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

Question 5:
Array values:
Index 0: 0
Index 1: 1
Index 2: 2
Index 3: 3
Index 4: 4

Question 6:
Array values:
Index 0: 0
Index 1: 2
Index 2: 4
Index 3: 6
Index 4: 8

Question 7:
Value at index 0: 1
Value at index 1: 2
Value at index 3: 4
Value at index 4: 5

Question 8:
c
b
a
d
e

Question 9:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 1
The biggest number is 3

Question 10:
Mixed array: [1, a, b, c, 1.1]

Question 11:
How many favorite things do you have? 7
Enter your thing: phone
Enter your thing: tv
Enter your thing: xbox
Enter your thing: wine
Enter your thing: beer
Enter your thing: sofa
Enter your thing: book
Your favorite things are:
phone tv xbox wine beer sofa book
Process finished with exit code 0

 */
