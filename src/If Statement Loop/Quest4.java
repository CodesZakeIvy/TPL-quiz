import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        //Write a JAVA language program to read a 10 numbers and print how many positive,
        // negative and zeros are entered.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");


        for (int i = 1; i <= 10; i++) {
            System.out.println("Number" + (i) + ":");
            int num = sc.nextInt();


            if (num > 0) {
                System.out.println("This is a positive number" + num);
            } else if (num < 0) {
                System.out.println("This is a negative number" + num);

            } else {
                System.out.println("I must be a 0" + num);



            }

        }
        sc.close();
    }
}