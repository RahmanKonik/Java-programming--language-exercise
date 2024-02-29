
// Write a program that evaluate the number and tell the user if it is a positive or negative number.
// Name: Konik Rahman.
// Date: 29-02-2024

import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your choice number:- ");

        int number = sr.nextInt();

        if ( number >= 0){
            System.out.println(number +" Positive number.");
        } else {
            System.out.println(number +" negative number.");
        }
    }

}
