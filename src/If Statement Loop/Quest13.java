public class Quest13 {
    public static void main(String[] args) {
        /*
            Write a JAVA language program to print the following triangle:
                                                *
                                             * * *
                                          * * * * *
                                       * * * * * * *
         */

        int rows = 4; // Number of rows in the triangle

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for each space
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* "); // Print a star followed by a space
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
