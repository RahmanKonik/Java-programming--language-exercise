
// Write a program that multiplying the two binary number.
// Name: Konik Rahman.
// Date: 10-03-2024

import java.util.Scanner;

public class MultiplyingTwoBinaryNumber {

    public static String multiplyTwoBinaryNumber(String firstNumber, String secondNumber) {

        int first = Integer.parseInt(firstNumber, 2);
        int second = Integer.parseInt(secondNumber, 2);

        int product = first * second ;

        return Integer.toBinaryString(product);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first binary number:- ");
        String firstBinaryNumber = scanner.nextLine();

        System.out.println("Enter your second binary number:- ");
        String secondBinaryNumber = scanner.nextLine();

        String product = multiplyTwoBinaryNumber(firstBinaryNumber, secondBinaryNumber);

        System.out.println("Product is :- "+product);

    }
}

// End of file
