import java.util.Scanner;

public class Questi17 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = sc.nextLine();

            int vowelCount = 0;
            str = str.toLowerCase();

            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }

            System.out.println("Total vowels: " + vowelCount);
        }
    }

