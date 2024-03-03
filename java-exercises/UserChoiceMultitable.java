
// Write a program that display the 1 to 9 tables .
// Name: Konik Rahman.
// Date: 03-03-2024

import java.util.Scanner;

public class UserChoiceMultitable {

    public static void myTable(int table) {

        int size = 10;

        for ( int i = 1; i <= size; i++){

            System.out.println( i +" X "+ table +" = "+i * table);
        }

    }

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your table number: - ");
        int table = sr.nextInt();
        myTable( table);
    }

}

// End of file
