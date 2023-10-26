package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to convert a decimal number to binary number
 * input data:
 * input a decimal number : 5
 * expected output
 * binary number is 101
 */
public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        System.out.println("Welcome to Java program to convert decimal to binary numbers ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number ");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //closing the scanner object
        scanner.close();
    }

    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is " + binary);


    }
}
