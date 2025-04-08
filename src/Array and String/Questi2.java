import java.util.Scanner;

public class Questi2 {
    public static void main(String[] args) {
        //     Write a JAVA program which read an array of 10
        //     integer values and find the largest number.

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 10 numbers :");



        // to read the numbers
        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();

        }
        for(int i = 0;i< num.length;i++){
            System.out.print(num[i]);

        }
        int largestNum = num[0];
        for(int c = 1; c< num.length ;c++){
            if(largestNum < num[c]){
                largestNum = num[c];
            }


        }
        System.out.println("Largest num " + largestNum);







    }
}
