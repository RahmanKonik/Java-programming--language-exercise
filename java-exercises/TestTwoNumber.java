
// Write a program that display the 1 to 9 tables .
// Name: Konik Rahman.
// Date: 07-03-2024

import java.util.Scanner;

public class TestTwoNumber {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int number = sr.nextInt();

        int value;
        value = (number == 1) ? 20: 30;
        System.out.println("Value:- "+value);

        value = (number == 10) ? 20: 30;
        System.out.println("Value:- "+value);
    }

}

// End of file
