package com.perscholas.java_basics;
import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        // Question 1

        int x = 7;
        //int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        }

        // Question 2
        //x = 7;
        x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        }

        // Question 3
        //x = 15;
        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if ( x >= 20) {
            System.out.println("Greater than or equal to 20");
        }


        // Question 4
        //x = 15;
        x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x >= 10 && x <= 20) {
            System.out.println("In range");
        }

        // Question 5
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

//        scanner.reset();

        // Check if the score is out of range
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else {
            // Determine the letter grade based on the score
            if (score >= 90 && score <= 100) {
                System.out.println("Grade: A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Grade: B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade: C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }


        // Question 6
        // Create a Scanner object for user input
//        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        scanner.close();


        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }

        // Question 7
        // Separate file, see another file in the same folder on github


    }


}

/* Output:
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=50752:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/xiwu/Desktop/tek_java/out/production/tek_java com.perscholas.java_basics.ConditionalStatements
Less than 10
Greater than 10
Greater than or equal to 20
Out of range
Enter the score: 99
Grade: A
Enter an integer between 1 and 7: 7
Sunday

Process finished with exit code 0

 */
