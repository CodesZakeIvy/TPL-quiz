public class Quest12 {
    public static void main(String[] args) {
        /*
         Write a JAVA language program to print the following pyramid.
                                                  1
                                               2 1 2
                                            3 2 1 2 3
                                         4 3 2 1 2 3 4
                                      5 4 3 2 1 2 3 4 5

         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print( " ");
            }
            //  decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");

            }
            System.out.println();


        }
    }
}