import java.util.Scanner;

public class Quest4b {
    public static void main(String[] args) {
        // Write a JAVA language program to read a 10 numbers and print the sum of positive and negative numbers separately.

        Scanner sc = new Scanner(System.in);
        int posSum = 0, negSum = 0;

        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if(num > 0) posSum += num;
            else negSum += num;
        }

        System.out.println("Sum of positives: " + posSum);
        System.out.println("Sum of negatives: " + negSum);
    }
    }

