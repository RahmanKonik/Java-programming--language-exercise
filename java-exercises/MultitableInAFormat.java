
// Write a program that display the 1 to 9 tables .
// Name: Konik Rahman.
// Date: 02-03-2024

public class MultitableInAFormat {

    /**
     * Function for prints the multitable 1 to 9.
     *
     */
    public static void myMultitable() {

        int size = 10;
        System.out.print("   * |");
        for ( int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n  --------------------------------------------");
        for ( int i = 1; i <= size; i++){
            System.out.printf("%4d |", i);
            for ( int j = 1; j <= size; j++){
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }

    }

    /**
     * Program for display the multitable in fixed format.
     *
     * @param args command line argument, not used in program
     */
    public static void main(String[] args) {
        myMultitable();
    }
}

// End of file
