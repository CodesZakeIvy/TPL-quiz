import java.util.Scanner;

public class Q12 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            countdown(n);
        }

        public static void countdown(int num) {
            if(num < 1) return;
            System.out.print(num + " ");
            countdown(num - 1);
        }
    }

