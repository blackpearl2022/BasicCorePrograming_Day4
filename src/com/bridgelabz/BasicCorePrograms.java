package com.bridgelabz;

import java.util.Scanner;

public class BasicCorePrograms<year> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Coin tossed ");
        int toss = scanner.nextInt();
        coinFlip(toss);

        System.out.println("Enter the year to check its Leap year or not");
        int year = scanner.nextInt();
        checkLeapYear(year);

        System.out.println("Enter the value of n to find n ^ 2");
        int n = scanner.nextInt();
        factorOfTwo(n);

        System.out.println("Enter the value of x to print the xth Harmonic value");
        int x = scanner.nextInt();
        harmonicValue(x);

        System.out.println("Please enter a Dividend");
        float dividend = scanner.nextFloat();
        System.out.println("Please enter a Divisor");
        float divisor = scanner.nextFloat();
        computeQuotientReminder(dividend, divisor);

        System.out.println("Enter 1st number to swap");
        int number1 = scanner.nextInt();
        System.out.println("Enter 2nd number to swap");
        int number2 = scanner.nextInt();
        swapingNumbers(number1, number2);

        System.out.println("Enter the number to check Even or odd");
        int number = scanner.nextInt();
        evenOrOdd(number);

        System.out.println("Enter the aplphabet to check the no is Vowel or Consonent ");
        char alphabet = scanner.next().charAt(0);
        vowelOrConsonent(alphabet);

        System.out.println("Enter 3 numbers to find largest among them:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int large;
        largestNumber(a, b, c);

    }

    private static void largestNumber(int a, int b, int c) {
        int large;
        if (a > b)
            large = a;
        else
            large = b;
        if (c > large)
            large = c;
        System.out.println("Largest number among 3 numbers :" + large);
    }

    private static void vowelOrConsonent(char alphabet) {
        if (alphabet == 'a' || alphabet == 'A')
            System.out.println("It is a vowel");
        else if (alphabet == 'e' || alphabet == 'E')
            System.out.println("It is a vowel");
        else if (alphabet == 'i' || alphabet == 'I')
            System.out.println("It is a vowel");
        else if (alphabet == 'o' || alphabet == 'O')
            System.out.println("It is a vowel");
        else if (alphabet == 'u' || alphabet == 'U')
            System.out.println("It is a vowel");
        else
            System.out.println("It is a consonant");
    }

    private static void evenOrOdd(int number) {
        if (number % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }

    private static void swapingNumbers(int number1, int number2) {
        System.out.println("Numbers before swapping : " + number1 + " " + number2);
        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;
        System.out.println("Number after swapping : " + number1 + " " + number2);
    }

    private static void computeQuotientReminder(float dividend, float divisor) {
        float quotient = dividend / divisor;
        float remainder = dividend % divisor;
        System.out.println("Quotient is : " + quotient);
        System.out.println("Remainder is : " + remainder);
    }

    private static double harmonicValue(int x) {
        double sum = 0;
        if (x > 0) {
            for (double i = 1; i <= x; i++) {
                sum += (1 / i);
            }

        } else {
            System.out.println("Enter a positive number:");
        }
        return sum;
    }

    private static void factorOfTwo(int n) {
        if (n > 0 && n < 31) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " " + Math.pow(2, i));
            }
        } else {
            System.out.println("Exceed max value, please enter lower value");
        }
    }

    private static void coinFlip(int toss) {
        if (toss < 0) {
            System.out.println("Please don't enter negative no");
        } else {
            int Heads = 0, Tails = 0;
            for (int i = 0; i < toss; i++) {
                double flipCoin = Math.random();
                if (flipCoin < 0.5) {
                    Heads++;
                    System.out.println("Heads");
                } else {
                    Tails++;
                    System.out.println("Tails");

                }
            }
            int Head = (Heads * 100) / toss;
            int Tail = (Tails * 100) / toss;
            System.out.println("Percentage Head:" + Head);
            System.out.println("Percentage Tail:" + Tail);
        }
    }

    private static void checkLeapYear(int year) {
        if (year < 1000) {
            System.out.println("Please enter four digit no");
        } else {
            if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0))
                System.out.println("Input Year " + year + " is a Leap year");
            else
                System.out.println("Input Year " + year + " is not a Leap year");
        }


    }
}


