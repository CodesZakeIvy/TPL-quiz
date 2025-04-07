public class Quest8b {
    public static void main(String[] args) {
        //Write a JAVA language program which prints the following series up to 10 terms.
        //1    2    4    8    16    32    64    128    256    512
        int term = 1;
        for(int i = 0; i < 10; i++) {
            System.out.print(term + " ");
            term *= 2;
        }
    }




}
