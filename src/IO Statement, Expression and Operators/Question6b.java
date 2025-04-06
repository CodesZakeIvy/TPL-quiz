import java.util.Scanner;

public class Question6b{
    public static void main(String[] args) {
        //Write a JAVA program which read two numbers a and b and
        // print these two number again
        // after swapping their values without using third variable.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a :");

        int a = sc.nextInt();

        System.out.println("Enter number b :");
        int b = sc.nextInt();

        a = a +b ;
        b = a -b;
        a = a -b;


        System.out.println("After swapping");
        System.out.println("a =" + a);
        System.out.println("b =" + b);

        sc.close();

    }
}