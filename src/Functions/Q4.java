import java.util.Scanner;

public class Q4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            System.out.println("Factorial: " + factorial(n));
        }

        public static int factorial(int num) {
            int result = 1;
            for(int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }

