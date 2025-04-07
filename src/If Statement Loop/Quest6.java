import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        /*

        Write a JAVA language program which read a number N and
         print its table up to 10 terms in following format. Let N=4
        1     *     4     =    4
        2     *     4     =    8
        3     *     4     =    12
                ----------------------
        10   *     4     =    40

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int N = sc.nextInt();




        for (int i = 1; i <= 10;i++){
            int result = i * N;
            System.out.println(i+ " * " + N + " = " + result);
            }

sc.close();

        }


    }
