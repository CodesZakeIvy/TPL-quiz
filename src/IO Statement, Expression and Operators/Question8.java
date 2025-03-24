import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Write a JAVA program which read two numbers a and b and
        // print these two number again after swapping their values.

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a number a :");
        int a = sc.nextInt();
        System.out.println( "Enter a number b :");
        int b = sc.nextInt();

        System.out.println( " Original values a = " + a + " and b = " + b );
        int temp = a;
        a = b;
        b = temp;



        System.out.println(" After swapping a = " + a + " and b =  " + temp);

        sc.close();
    }
}
