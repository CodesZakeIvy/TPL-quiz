import java.util.Scanner;

public class Q2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Largest: " + getLargest(a, b));
        }

        public static int getLargest(int x, int y) {
            return (x > y) ? x : y;
        }
    }

