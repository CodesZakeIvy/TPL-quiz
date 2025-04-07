import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Quest3b {
    public static void main(String[] args) {
        //Check if a number is a factor of another number:
        // Write a program that checks
        // if a given number is a factor of another number.
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the potential factor: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number to check: ");
        int num2 = sc.nextInt();
        for (int i = 1; i <= num1; i++) {



                // Check and display result
                //if (isFactor(num1, num2)) {
                if (num1 % i == 0) {
                    System.out.println(num1 + " is a factor of " + num2);
                } else if (num2 % i == 0){
                    System.out.println(num2 + " is a factor of " + num1);
                }else{
                    System.out.println(num2 +"is not a factor of" + num1);
                }

                sc.close();

            }
        }
    }

//        // Method to check if num1 is a factor of num2
//        public static boolean isFactor ( int num1, int num2){
//            if (num1 == 0) {
//                return false; // Division by zero is undefined
//            }
//            return num2 % num1 == 0;
//        }







