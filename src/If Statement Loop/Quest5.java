import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args) {
        // Write a JAVA language program
        // which read two numbers and print their sum without using + symbol.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : " );
        int a = sc.nextInt();

        System.out.println("Enter number : " );
        int f = sc.nextInt();

        int sum = a -(-f);

        System.out.println("Sum is  " + sum);
    }
}
