import java.util.Scanner;

public class Q8 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three real numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            printAverage(a, b, c);
        }

        public static void printAverage(double x, double y, double z) {
            System.out.println("Average: " + (x + y + z)/3);
        }
    }

