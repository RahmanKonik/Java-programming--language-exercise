
// Write a program that convert a String number to binary number.
// Name: Konik Rahman.
// Date: 09-03-2024

import java.util.Scanner;

public class ConvertAStringNumberIntoBinaryNumber {

    public static String myBinaryNumber( String number) {

        int binary = Integer.parseInt(number);

        return Integer.toBinaryString(binary);


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        String number = scanner.nextLine();

        String value = myBinaryNumber(number);
        System.out.println("Binary number of "+number+" is "+ value);
    }
}

// End of file

