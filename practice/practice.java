package com.perscholas.java_basics;
import java.text.DecimalFormat;

public class practice {
    public static void main(String[] args) {
        // Practice 1:
        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("The sum of num1 and num2：" + sum);

        // Practice 2:
        double d1 = 1.0;
        double d2 = 2.0;
        double sum2 = d1 + d2;
        System.out.println("The sum of d1 and d2：" + sum2);

        // Practice 3:
        int int1 = 1;
        double double1 = 1.0;
        double sum3 = int1 + double1;
        System.out.println("The sum of one int and one double variables: " + sum3);

        // Practice 4:
        int number1 = 2;
        int number2 = 1;
        int result;
        result = number1 / number2;
        System.out.println("Result of number 1 divide number 2: " + result);

        // Changing one of the numbers to a decimal
        double num2_decimal = 10.0; // Changed to decimal
        double result_decimal = number1 / num2_decimal;
        System.out.println("Result with one decimal: " + result_decimal);

        // Practice 5:
        double num_d1 = 20.5;
        double num_d2 = 10.2;
        double result2;

        result2 = num_d1 / num_d2;
        System.out.println("Result of num1 and num2 are double variables: " + result2);

        // Casting the result to an integer
        int resultInt = (int) result2;
        System.out.println("Result as an integer(cast double to int): " + resultInt);

        // Practice 6:
        int x = 5;
        int y = 6;

        int q = y / x;
        System.out.println("q as an integer: " + q);

        // Casting y to a double
        double q_d = (double) y;
        System.out.println("q as a double variable: " + q_d);

        // Practice 7:
        final double ONES = 1.11; // Declaring a named constant
        double two = 2.0;
        double res = ONES * two * two * two;

        System.out.println("result contains const calculation: " + res);


        // Practice 8:
        // Initialization
        double coffeePrice = 5.50;
        double cappuccinoPrice = 6.00;
        double greenTeaPrice = 2.50;

        // Quantities ordered
        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int greenTeaQty = 2;

        final double SALES_TAX = 1.1;

        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (greenTeaPrice * greenTeaQty);

        // Calculate total sale including tax
        double totalSale = subtotal * SALES_TAX;

        // Formatting the results to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Subtotal of 3 items: $" + df.format(subtotal));
        System.out.println("Total Sale including tax (10%): $" + df.format(totalSale));
    }
}
