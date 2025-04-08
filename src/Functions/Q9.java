import java.util.Scanner;

public class Q9 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three integers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Largest: " + getLargest(a, b, c));
        }

        public static int getLargest(int x, int y, int z) {
            return (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        }
    }

