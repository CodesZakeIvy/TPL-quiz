import java.util.Scanner;

public class Quest3a {
    public static void main(String[] args) {
        // Find all factors of a number:
        // Write a program to find all factors of a
        // number entered by the user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("The factors of " + number + " are :");

        for(int i = 1; i <= number; i++ ){
            if (number % i == 0){
                System.out.println(i + "");
            }
            sc.close();
        }


    }
}
