import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        //Write a JAVA program which read five numbers
        // and print the average of entered numbers.

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the  five numbers :");

        int sum = 0;

        int[] numbers = new int[5];

        for(int i=0;i<5;i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];

        }
        int average =  sum /5;

        System.out.println("The average is " + average);


        sc.close();






    }

}
