import java.util.Scanner;

public class Questi10 {
    public static void main(String[] args) {
        //     Write a JAVA program which
        //     read a string and print the string in reverse form.


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String :");
        String sentence = sc.nextLine();


        for(int i = sentence.length()-1; i >= 0; i--){
            char c=sentence.charAt(i);

            System.out.print(c);




        }
    }
}
