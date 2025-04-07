import java.util.Scanner;

public class Quest6b {
    public static void main(String[] args) {

                // Write a JAVA language program which read a number N and print the following.
                //                                              N              Square(N)          Cube(N)
                //                                              -----------------------------------------
                //                                               1                    1                         1
                //                                               2                    4                         8
                //                                               3                    9                         27
                //                                               4                    16                       64
                //                                               5                    25                       125
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("N\tSquare(N)\tCube(N)");
        System.out.println("----------------------------------");
        for(int i = 1; i <= N; i++) {
            System.out.println(i + "\t" + (i*i) + "\t\t" + (i*i*i));
        }
    }

    }


