import java.util.Scanner;

public class Q11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            printTable(n);
        }

        public static void printTable(int num) {
            for(int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
