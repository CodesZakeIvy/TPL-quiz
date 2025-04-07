public class Quest10b {
    public static void main(String[] args) {
        //  Write a JAVA language program to print the following triangle.
        //                                                                 5
        //                                                             5  4
        //                                                         5  4  3
        //                                                     5  4  3  2
        //                                                 5  4  3  2  1

        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            // Print spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for(int k = rows; k >= rows - i + 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
