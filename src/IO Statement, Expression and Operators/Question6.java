import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        //Write a JAVA program which read a number N of two digits
        // and print the sum of its digits.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two digit number :");

        int number = sc.nextInt();

        if (number <10 || number>99){
            System.out.println("Please enter a value between 10 and 99 ");
        }else{
            int tenDigit = number /10;
            int oneDigit = number %10;

            int sum = tenDigit + oneDigit ;
            System.out.println("The sum of the digits is " + sum);
        }

    }
}
