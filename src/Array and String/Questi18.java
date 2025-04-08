import java.util.Scanner;

public class Questi18 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = sc.nextLine();

            int wordCount = str.split("\\s+").length;
            int sentenceCount = str.split("[.!?]").length;

            System.out.println("Total words: " + wordCount);
            System.out.println("Total sentences: " + sentenceCount);
        }
    }

