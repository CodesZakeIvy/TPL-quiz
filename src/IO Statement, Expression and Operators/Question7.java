import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        //Write a JAVA program which read a real value and
        // print the integer and decimal part separately.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value :");

        double digit = sc.nextDouble();

        if(digit ==  (int) digit) {
            System.out.println("The value of an integer is " + (int) digit);


            }else{
            System.out.println("The value of a decimal is " + digit );

        }

    }
}
