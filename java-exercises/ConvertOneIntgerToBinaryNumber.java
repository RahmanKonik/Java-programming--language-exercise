
// Write a program that convert a integer to binary number.
// Name: Konik Rahman.
// Date: 08-03-2024

import java.util.Scanner;

public class ConvertOneIntgerToBinaryNumber {

    public static String myInteger( int number) {

        // to check number is zero or not.
        if ( number == 0){
            return "0";
        }

        // integer to binary and return it as a string.

        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            int reminder = number % 2;
            binary.insert(0, reminder);
            number /= 2;
        }

        return binary.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to convert into binary number: -");
        int number = scanner.nextInt();

        String binaryNumber = myInteger( number);
        System.out.println("Binary number of "+ number+ " is - "+binaryNumber);
    }
}

// End of file

