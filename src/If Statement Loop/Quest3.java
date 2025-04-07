import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        //Write a JAVA language program to read a number N and print its factorial.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are:");


        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.println(i + " ");

            }
sc.close();
        }
    }
}
