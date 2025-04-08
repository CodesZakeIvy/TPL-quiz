import java.util.Scanner;

public class Questi3 {
    public static void main(String[] args) {
        // Write a JAVA program which read a number N and
        // find it in an array of 10 integer values. If N is found in array then “Number Found”
        // should be displayed otherwise “Number Not Found” should be displayed.

        Scanner sc = new Scanner(System.in);
        int []  num = new int[10];
        System.out.println("Enter 10 numbers  ;");


        // read the numbers
        for( int i = 0;i< num.length; i++) {
            num[i] = sc.nextInt();
            //
        }

        System.out.print("Enter number to search :");
                int N = sc.nextInt();

                boolean found = false;


        for( int i = 0;i< num.length; i++){
                if (num[i] == N) {
                    found = true;
                    break;
                }
                if(found){
                    System.out.println("Number found");
                }else{
                    System.out.println("Number not found");
                }


        }

    }
}
