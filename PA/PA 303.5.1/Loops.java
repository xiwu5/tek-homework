package com.perscholas.java_basics;
import java.util.Scanner;
/*
    PA 303.5.1 Loops
 */
public class Loops {
    public static void main(String[] Strings) {
        // Question 1
        /*
            Iteration 1 (i = 1):

                Inner Loop (Columns):
                Iteration 1 (j = 1): Calculate and print 1 * 1 = 1
                Iteration 2 (j = 2): Calculate and print 1 * 2 = 2
                Iteration 3 (j = 3): Calculate and print 1 * 3 = 3
                ...
                move to the next line.

            Iteration 2 (i = 2):

                Inner Loop (Columns):
                Iteration 1 (j = 1): Calculate and print 2 * 1 = 2
                Iteration 2 (j = 2): Calculate and print 2 * 2 = 4
                Iteration 3 (j = 3): Calculate and print 2 * 3 = 6\
                ...
                move to the next line.

            Iteration 3 (i = 3):

                Inner Loop (Columns):
                Iteration 1 (j = 1): Calculate and print 3 * 1 = 3
                Iteration 2 (j = 2): Calculate and print 3 * 2 = 6
                Iteration 3 (j = 3): Calculate and print 3 * 3 = 9
                ...
                move to the next line.
            ...
         */

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                int res = i * j;
                System.out.printf("%4d", res);
                //This means that even if the result is a single digit number, it will still occupy 4 characters (filled with spaces on the left, if needed).
            }
            System.out.println();
        }


        // Question 2
        // Find common gcd by n1 % 2 == 0 && n2 % 2 == 0, starts from k = 2, untill k hit the Math.min(n1, n2)
        Scanner scanner = new Scanner(System.in);


        System.out.print("\nEnter the first positive integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        // Edge cases
        // Check if either of the input numbers is zero
        if (n1 == 0 && n2 == 0) {
            System.out.println("Both input numbers are zero. GCD is undefined.");
        } else if (n1 == 0) {
            System.out.println("The greatest common divisor (GCD) is " + n2 + ".");
        } else if (n2 == 0) {
            System.out.println("The greatest common divisor (GCD) is " + n1 + ".");
        } else {
            // Call the helper function to find the GCD
            int gcd = findGCD(n1, n2);
            System.out.println("The greatest common divisor (GCD) of " + n1 + " and " + n2 + " is " + gcd + ".");
        }

        scanner.close();

        // Question 3
        double initialTuition = 10000; // Year 0 tuition amount
        double curTuition = initialTuition; // Store the "current" tuition fee in while loop
        double targetTuition = initialTuition * 2; // Target amount

        int years = 0;

        while (curTuition < targetTuition) {
            // Increase tuition by 7 percent every year
            curTuition *= 1.07;
            years++; // Increment the number of years
        }

        // Print the result
        System.out.println("\nIt will take " + years + " years for the tuition to be doubled.");

    }

    // Function to find the GCD using the described method
    // For Question 2
    public static int findGCD(int n1, int n2) {
        int gcd = 1;

        // Loop from 2 to the smaller of n1 and n2
        for (int k = 2; k <= Math.min(n1, n2); k++) {

            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        return gcd;
    }
}

/*
Output:
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=59910:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/xiwu/Desktop/tek_java/out/production/tek_java com.perscholas.java_basics.Loops
   1   2   3   4   5   6   7   8   9  10  11  12
   2   4   6   8  10  12  14  16  18  20  22  24
   3   6   9  12  15  18  21  24  27  30  33  36
   4   8  12  16  20  24  28  32  36  40  44  48
   5  10  15  20  25  30  35  40  45  50  55  60
   6  12  18  24  30  36  42  48  54  60  66  72
   7  14  21  28  35  42  49  56  63  70  77  84
   8  16  24  32  40  48  56  64  72  80  88  96
   9  18  27  36  45  54  63  72  81  90  99 108
  10  20  30  40  50  60  70  80  90 100 110 120
  11  22  33  44  55  66  77  88  99 110 121 132
  12  24  36  48  60  72  84  96 108 120 132 144

Enter the first positive integer: 99
Enter the second positive integer: 9
The greatest common divisor (GCD) of 99 and 9 is 9.

It will take 11 years for the tuition to be doubled.

Process finished with exit code 0


 */
