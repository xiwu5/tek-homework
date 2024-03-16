package com.perscholas.java_basics;

public class OpetatorsAndNumbers {
    public static void main(String[] args) {
        /*
            PA 303.2.3 Question 1:

        */

        // a. For value 9
        int x = 9;
        // Predicted decimal value: 18, Predicted binary string: 10010
        x = x << 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // b. For value 17
        x = 17;
        // Predicted decimal value: 34, Predicted binary string: 100010
        x = x << 1;
        System.out.println("\nDecimal Value: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        // c. For value 88
        x = 88;
        // Predicted decimal value: 176, Predicted binary string: 10110000
        x = x << 1;
        System.out.println("\nDecimal Value: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        /*
            PA 303.2.3 Question 2
        */
        // a. For value 225
        int x2 = 225;
        System.out.println("\nOriginal Binary: " + Integer.toBinaryString(x2));
        // Anticipated decimal value is 56, and the anticipated binary string is 111000
        x2 = x2 >> 2;
        System.out.println("Decimal Value: " + x2);
        System.out.println("Binary Value: " + Integer.toBinaryString(x2));

        // b. For value 1555
        x2 = 1555;
        System.out.println("\nOriginal Binary: " + Integer.toBinaryString(x2));
        // Anticipated decimal value is 388, and the anticipated binary string is 110000100
        x2 = x2 >> 2;
        System.out.println("Decimal Value: " + x2);
        System.out.println("Binary Value: " + Integer.toBinaryString(x2));

        // c. For value 32456
        x2 = 32456;
        System.out.println("\nOriginal Binary: " + Integer.toBinaryString(x2));
        // Anticipated decimal value is 8114, and the anticipated binary string is 111111011010
        x2 = x2 >> 2;
        System.out.println("Decimal Value: " + x2);
        System.out.println("Binary Value: " + Integer.toBinaryString(x2));

        /*
            PA 303.2.3 Question 3
        */

        x = 7;
        int y = 17;

        // Predicted result of bitwise AND operation on x and y is 1 and the corresponding binary is 0001
        int z = x & y;

        System.out.println("\nDecimal value of z: " + z);
        System.out.println("Binary representation of z: " + Integer.toBinaryString(z));

        /*
            PA 303.2.3 Question 4
        */
        x = 7;
        y = 17;

        // Predicted result of bitwise OR operation on x and y is 23 and the corresponding binary is 10111)
        z = x | y;

        System.out.println("\nDecimal value of z: " + z);
        System.out.println("Binary representation of z: " + Integer.toBinaryString(z));

        /*
            PA 303.2.3 Question 5
        */
        int number = 2;

        // Before
        System.out.println("\nInitial value: " + number);
        // postfix increment operator
        number++;
        System.out.println("Value after increment: " + number);

        /*
            PA 303.2.3 Question 6
        */
        int number2 = 1;

        // Method 1: Using '++'
        System.out.println("\nMethod 1 Using '++':");
        System.out.println("Initial value: " + number2);
        number2++;
        System.out.println("Value after first increment: " + number2);
        number2++;
        System.out.println("Value after second increment: " + number2);

        // Method 2: Using '+='
        number = 1; // Reset
        System.out.println("\nMethod 2 Using '+=':");
        System.out.println("Initial value: " + number);
        number += 1;
        System.out.println("Value after first increment: " + number);
        number += 1;
        System.out.println("Value after second increment: " + number);

        // Method 3: Using addition operator '+'
        number = 1; // Reset number
        System.out.println("\nMethod 3:");
        System.out.println("Initial value: " + number);
        number = number + 1;
        System.out.println("Value after first increment: " + number);
        number = number + 1;
        System.out.println("Value after second increment: " + number);

        /*
            PA 303.2.3 Question 7
        */
        x = 5;
        y = 8;

        int sumPrefix = ++x + y;
        System.out.println("\nUsing prefix increment operator:");
        System.out.println("Sum: " + sumPrefix);


        x = 5; // Reset
        int sumPostfix = x++ + y;
        System.out.println("\nUsing postfix increment operator:");
        System.out.println("Sum: " + sumPostfix);



    }

}
