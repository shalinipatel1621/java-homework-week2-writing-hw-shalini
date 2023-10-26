package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */

public class Programme_13_AverageOfNumbers {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number ");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        //closing the scanner object
        scanner.close();
    }

    //Calculating the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c);
        System.out.println("The average of three numbers " + a + " + " + b + " + " + c + " is : " + average);

    }
}
