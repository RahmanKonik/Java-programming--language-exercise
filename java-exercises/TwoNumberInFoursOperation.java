
// Write a program that will ask the user for two number and four result will be display( +, -, * , /) .
// Name: Konik Rahman.
// Date: 28-02-2024

import java.util.Scanner;

public class TwoNumberInFoursOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Number:- ");
        int first_number = scanner.nextInt();

        System.out.println("Enter the another Number:- ");
        int Second_number = scanner.nextInt();

        System.out.println("Addition:- "+ first_number +" + "+Second_number+" = "+ (first_number + Second_number));
        System.out.println("Multiplication:- "+ first_number +" * "+Second_number+" = "+ (first_number * Second_number));
        System.out.println("Substraction:- "+ first_number +" - "+Second_number+" = "+ (first_number - Second_number));
        System.out.println("Divide:- "+ first_number +" / "+Second_number+" = "+ (first_number / Second_number));
    }
}

// End of file
