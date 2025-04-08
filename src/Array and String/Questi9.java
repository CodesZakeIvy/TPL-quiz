import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Questi9 {
    public static void main(String[] args) {
        // Write a JAVA program which read a string and
        // convert its all characters into uppercase letter.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String:");
        String sentence = sc.nextLine();

        String [] chara = new String[]{sentence.toUpperCase()};
        System.out.println(" This is the sentence in CAPS :"  + Arrays.toString(chara));


    }
}
