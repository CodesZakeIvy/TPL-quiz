import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        //Write a JAVA language program which
        // read a number N and print whether it is prime number or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int N = sc.nextInt();
        boolean isPrime = true;



            if (N <= 1) {
                isPrime = false;
                System.out.println("I am not a prime number");


            } else {
                for(int i = 2;i<=Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        isPrime = false;

                        break;
                    }
                }
            }
            if (isPrime ){
                System.out.println( N + " is a prime number");

        }else{
                System.out.println(N + " is not a prime number");
            }
            sc.close();
    }




}