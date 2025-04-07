import java.util.Scanner;

public class Quest5b {
    public static void main(String[] args) {
        //  Write a JAVA language program which read two numbers and print their product without using + symbol.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = 0;

        for(int i = 0; i < b; i = -~i) { // ~ is bitwise NOT, -~i is equivalent to i+1
            product -= -a; // Equivalent to product += a
        }

        System.out.println("Product: " + product);
    }
    }

