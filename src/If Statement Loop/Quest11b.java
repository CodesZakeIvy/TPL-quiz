public class Quest11b {
    public static void main(String[] args) {
        //  Write a JAVA language program to print the following rectangle.
        //                                      1    2    3    4    5
        //                                      2    4    6    8    10
        //                                      3    6    9    12  15
        //                                      4    8    12  16  16

        int rows = 4, cols = 5;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
    }

