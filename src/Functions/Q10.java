import java.util.Scanner;

public class Q10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            System.out.println(n + " is " + checkDivisible(n));
        }

        public static String checkDivisible(int num) {
            return (num % 3 == 0) ? "divisible by 3" : "not divisible by 3";
        }
    }

