import java.util.Scanner;

public class Question4b {

    public static void main(String[] args) {
        //Write a JAVA program which read a number of 2 digits and
        // print the number after changing digit’s positions.
        // (Hint: if entered number is 54 then output should be 45).


                Scanner sc = new Scanner(System.in);
                int num;

                // Prompt user
                System.out.println("Enter a two-digit number:");

                // Validate input
                while (true) {
                    num = sc.nextInt();
                    if (num >= 10 && num <= 99) {
                        break;
                    }
                    System.out.println("Kindly provide a valid two-digit number:");
                }

                // Swap digits
                int num1 = num / 10;  // Get the tens place digit
                int num2 = num % 10;  // Get the ones place digit
                int reversedNum = num2 * 10 + num1;

                // Print results
                System.out.println("Original number: " + num);
                System.out.println("Reversed number: " + reversedNum);

                sc.close();
            }
        }






