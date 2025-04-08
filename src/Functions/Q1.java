import java.util.Scanner;

public class Q1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three integers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            printSum(a, b, c);
        }

        public static void printSum(int x, int y, int z) {
            System.out.println("Sum: " + (x + y + z));
        }
    }

