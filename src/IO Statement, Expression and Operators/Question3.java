import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Write a JAVA program which reads two integer values
        // and print the sum and product of both numbers.

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter two numbers :");

        int j = sc.nextInt();
        int k = sc.nextInt();
        int sum;
        int product;

        sum = j+k;
        product = j*k;

        System.out.println(sum);
        System.out.println(product);


    }
}
