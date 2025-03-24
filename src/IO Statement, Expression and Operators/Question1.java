import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Write a JAVA program which read two unsigned integer value and
        // print both by using printf() statement.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Numbers: ");

        int x = sc.nextInt();
        int h = sc.nextInt();

        System.out.printf( "%d %d" ,h ,x );



sc.close();
    
}

}