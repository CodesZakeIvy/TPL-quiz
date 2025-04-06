import java.util.Scanner;

public class Question3b {
    public static void main(String[] args) {
        //Write a JAVA program which read a number of 3 digits and
        // print the number in reverse order of its digits.
        // (Hint: If N = 324 then output should be 423)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three digit number :");

        int number = sc.nextInt();



        while (number < 100 || number > 999) {
            System.out.println("Invalid input! Please enter a three-digit number:");
            number = sc.nextInt();
        }

        // Extract digits
        int num1 = number / 100;        // Get the hundreds place digit
        int num2 = (number / 10) % 10;  // Get the tens place digit
        int num3 = number % 10;         // Get the ones place digit

        // Output result

        System.out.println("Print numbers : "+number);

        System.out.println("Print in reverse:" +num3 + num2 + num1);


        sc.close();
    }


}
