public class Quest12b {
    public static void main(String[] args) {
        //    Write a JAVA language program to print the following pyramid.
        //                                                  1
        //                                               2 3 2
        //                                            3 4 5 4 3
        //                                         4 5 6 7 6 5 4
        //                                      5 6 7 8 9 8 7 6 5

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print increasing numbers
            for (int k = i; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }
            // Print decreasing numbers
            for (int l = 2 * i - 2; l >= i; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}

