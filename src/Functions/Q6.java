import java.util.Scanner;

public class Q6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a decimal number:");
            int n = sc.nextInt();
            System.out.print("Binary: ");
            decToBin(n);
        }

        public static void decToBin(int num) {
            if(num > 0) {
                decToBin(num / 2);
                System.out.print(num % 2);
            }
        }
    }
