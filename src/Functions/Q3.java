import java.util.Scanner;

public class Q3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            System.out.println(n + " is " + checkEvenOdd(n));
        }

        public static String checkEvenOdd(int num) {
            return (num % 2 == 0) ? "Even" : "Odd";
        }
    }

