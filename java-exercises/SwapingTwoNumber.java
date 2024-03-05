
// Write a program that display the 1 to 9 tables .
// Name: Konik Rahman.
// Date: 05-03-2024

public class SwapingTwoNumber {

    public static void mySwap(int a, int b) {

        int temp;

        System.out.println("Before swapping:- a= "+ a+" , b = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:- a = "+ a+ ", b = "+b);
    }

    public static void main(String[] args) {
        int numberOne = 15;
        int numberTwo = 25;

        mySwap(numberOne, numberTwo);
    }
}

// End of file
