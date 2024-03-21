package com.perscholas.java_basics;

import java.util.Scanner;

public class CalculateTax {
    private static final int STATUS_ZERO_LEVEL_ONE_LIMIT = 8350;
    private static final int STATUS_ZERO_LEVEL_TWO_LIMIT = 33950;
    private static final int STATUS_ZERO_LEVEL_THREE_LIMIT = 82250;
    private static final int STATUS_ZERO_LEVEL_FOUR_LIMIT = 171550;
    private static final int STATUS_ZERO_LEVEL_FIVE_LIMIT = 372950;
    private static final int STATUS_ONE_LEVEL_ONE_LIMIT = 16700;
    private static final int STATUS_ONE_LEVEL_TWO_LIMIT = 67900;
    private static final int STATUS_ONE_LEVEL_THREE_LIMIT = 137050;
    private static final int STATUS_ONE_LEVEL_FOUR_LIMIT = 208850;
    private static final int STATUS_ONE_LEVEL_FIVE_LIMIT = 372950;
    private static final int STATUS_TWO_LEVEL_ONE_LIMIT = 8350;
    private static final int STATUS_TWO_LEVEL_TWO_LIMIT = 33950;
    private static final int STATUS_TWO_LEVEL_THREE_LIMIT = 68525;
    private static final int STATUS_TWO_LEVEL_FOUR_LIMIT = 104425;
    private static final int STATUS_TWO_LEVEL_FIVE_LIMIT = 186475;
    private static final int STATUS_THREE_LEVEL_ONE_LIMIT = 11950;
    private static final int STATUS_THREE_LEVEL_TWO_LIMIT = 45500;
    private static final int STATUS_THREE_LEVEL_THREE_LIMIT = 117450;
    private static final int STATUS_THREE_LEVEL_FOUR_LIMIT = 190200;
    private static final int STATUS_THREE_LEVEL_FIVE_LIMIT = 372950;
    private static final double RATE_TEN_PERCENT = 0.1;
    private static final double RATE_FIFTEEN_PERCENT = 0.15;
    private static final double RATE_TWENTY_FIVE_PERCENT = 0.25;
    private static final double RATE_TWENTY_EIGHT_PERCENT = 0.28;
    private static final double RATE_THIRTY_THREE_PERCENT = 0.33;
    private static final double RATE_THIRTY_FIVE_PERCENT = 0.35;

    private static double calculateTax (final int limit1, final int limit2, final int limit3,
                                        final int limit4, final int limit5, double income) {
        double tax;
        double fullTaxLimit1 = limit1 * RATE_TEN_PERCENT;
        double fullTaxLimit2 = (limit2 - limit1) * RATE_FIFTEEN_PERCENT;
        double fullTaxLimit3 = (limit3 - limit2) * RATE_TWENTY_FIVE_PERCENT;
        double fullTaxLimit4 = (limit4 - limit3) * RATE_TWENTY_EIGHT_PERCENT;
        double fullTaxLimit5 = (limit5 - limit4) * RATE_THIRTY_THREE_PERCENT;

        if (income > 0 && income <= limit1) {
            tax = income * RATE_TEN_PERCENT;
        } else if (income <= limit2) {
            tax = (income - limit1) * RATE_FIFTEEN_PERCENT +
                    fullTaxLimit1;
        } else if (income <= limit3) {
            tax = (income - limit2) * RATE_TWENTY_FIVE_PERCENT +
                    fullTaxLimit1 +
                    fullTaxLimit2;
        } else if (income <= limit4) {
            tax = (income - limit3) * RATE_TWENTY_EIGHT_PERCENT +
                    fullTaxLimit1 +
                    fullTaxLimit2 +
                    fullTaxLimit3;
        } else if (income <= limit5) {
            tax = (income - limit4) * RATE_THIRTY_THREE_PERCENT +
                    fullTaxLimit1 +
                    fullTaxLimit2 +
                    fullTaxLimit3 +
                    fullTaxLimit4;
        } else {
            tax = (income - limit5) * RATE_THIRTY_FIVE_PERCENT +
                    fullTaxLimit1 +
                    fullTaxLimit2 +
                    fullTaxLimit3 +
                    fullTaxLimit4 +
                    fullTaxLimit5;
        }
        return tax;
    }


    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        switch (status) {
            case 0: // calculate the tax of Single status
                tax = calculateTax(STATUS_ZERO_LEVEL_ONE_LIMIT,
                        STATUS_ZERO_LEVEL_TWO_LIMIT,
                        STATUS_ZERO_LEVEL_THREE_LIMIT,
                        STATUS_ZERO_LEVEL_FOUR_LIMIT,
                        STATUS_ZERO_LEVEL_FIVE_LIMIT,
                        income);
                break;
            case 1: // calculate the tax of Married Filing Jointly or Qualified Widow(er) status
                tax = calculateTax(STATUS_ONE_LEVEL_ONE_LIMIT,
                        STATUS_ONE_LEVEL_TWO_LIMIT,
                        STATUS_ONE_LEVEL_THREE_LIMIT,
                        STATUS_ONE_LEVEL_FOUR_LIMIT,
                        STATUS_ONE_LEVEL_FIVE_LIMIT,
                        income);
                break;
            case 2: // calculate the tax of Married Filing Separately status
                tax = calculateTax(STATUS_TWO_LEVEL_ONE_LIMIT,
                        STATUS_TWO_LEVEL_TWO_LIMIT,
                        STATUS_TWO_LEVEL_THREE_LIMIT,
                        STATUS_TWO_LEVEL_FOUR_LIMIT,
                        STATUS_TWO_LEVEL_FIVE_LIMIT,
                        income);
                break;
            case 3: // calculate the tax of Head of Household status
                tax = calculateTax(STATUS_THREE_LEVEL_ONE_LIMIT,
                        STATUS_THREE_LEVEL_TWO_LIMIT,
                        STATUS_THREE_LEVEL_THREE_LIMIT,
                        STATUS_THREE_LEVEL_FOUR_LIMIT,
                        STATUS_THREE_LEVEL_FIVE_LIMIT,
                        income);
                break;
        }
        System.out.println("Tax is: " + tax);
        input.close();
    }
}

/* Output1:
Enter the filing status: 0
Enter the taxable income: 100000
Tax is: 21720.0

** Output2:
Enter the filing status: 1
Enter the taxable income: 300339
Tax is: 76932.87000000001

** Output3:
Enter the filing status: 2
Enter the taxable income: 123500
Tax is: 29665.5

** Output4:
Enter the filing status: 2
Enter the taxable income: 123500
Tax is: 29665.5
*/
