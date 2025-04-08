import java.util.Scanner;

public class Questi8 {
    public static void main(String[] args) {
        //Write a JAVA program which read a string and print total number of words.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = sc.nextLine();

        String [] words = sentence.trim().split("\\s+");
        System.out.println("Number of words :" + words.length);

   sc.close();
    }

}
