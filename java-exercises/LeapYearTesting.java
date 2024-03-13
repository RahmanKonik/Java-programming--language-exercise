
// Write a program that to check the user input year Is it leap year or Not.
// Name: Konik Rahman.
// Date: 13-03-2024

import java.util.Scanner;

public class LeapYearTesting {

    public static void myLeapYear(int year) {

        if ((( year % 4==0 ) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year+ " is Leap Year!.");
        } else {
            System.out.println(year + " is not lear year. it is a common year.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:- ");
        int year = scanner.nextInt();
        myLeapYear(year);
    }

}

// End of file
