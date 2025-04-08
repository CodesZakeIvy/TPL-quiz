import java.util.Scanner;

public class Questi1 {
    public static void main(String[] args) {


        //Write a JAVA program which read an array of 10
        // integer values and print the sum of all values.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");

        int [] num  = new int[10];
        int sum = 0;


        // to read the numbers
        for (int i = 0; i < 10; i++){
            num[i] = sc.nextInt();


            }
        for(int i = 0;i<10;i++){
            sum += num[i];


        }
        System.out.println("Sum of all the numbers: " + sum);


    }
}