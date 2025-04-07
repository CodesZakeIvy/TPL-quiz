public class Quest9b {
    public static void main(String[] args) {
        /*Write a JAVA language program to print the following triangle.
                                                 *
                                                 *  *
                                                 *  *  *
                                                 *  *  *  *
                                                 *  *  *  *  *

   */
        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}
