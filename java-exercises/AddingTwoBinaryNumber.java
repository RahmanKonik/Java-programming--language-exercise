
// Write a program that display the 1 to 9 tables .
// Name: Konik Rahman.
// Date: 07-03-2024

import java.util.Scanner;

public class AddingTwoBinaryNumber {

    public static String twoNumberAddition(String one , String two) {

        int sum = Integer.parseInt(one, 2) + Integer.parseInt(two,2);

        return Integer.toBinaryString(sum);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary Number:- ");
        String firstBinaryNumber = scanner.nextLine();

        System.out.println("Enter the second binary Number:- ");
        String secondBinaryNumber = scanner.nextLine();

        String summation = twoNumberAddition(firstBinaryNumber, secondBinaryNumber);

        System.out.println("Result is :- "+summation);
    }
}

// End of file
