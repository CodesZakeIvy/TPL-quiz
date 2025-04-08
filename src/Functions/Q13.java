import java.util.Scanner;

public class Q13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a 4-digit number:");
            int n = sc.nextInt();
            System.out.print("Reversed: ");
            reverseDigits(n);
        }

        public static void reverseDigits(int num) {
            if(num < 10) {
                System.out.print(num);
                return;
            }
            System.out.print(num % 10);
            reverseDigits(num / 10);
        }
    }

