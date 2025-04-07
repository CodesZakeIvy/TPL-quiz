import java.util.Scanner;

public class Quest3c {
    public static void main(String[] args) {
        //    Write a JAVA language program to read a number N and print numbers
        //    from N to 1. i.e. N  N-1   N-2 . . . 3   2   1

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
