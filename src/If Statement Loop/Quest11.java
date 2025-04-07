public class Quest11 {
    public static void main(String[] args) {
        /*
        Write a JAVA language program to print the following rectangle.
                                      2    3    4    5    6
                                      3    4    5    6    7
                                      4    5    6    7    8
                                      5    6    7    8    9

         */

        int rows = 4;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((i + j + 2) + "   ");




            }
            System.out.println();


        }

//       \
    }
}