import java.util.Scanner;

public class Questi19 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = sc.nextLine();

            String lowerStr = "";
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= 'A' && ch <= 'Z') {
                    lowerStr += (char)(ch + 32);
                } else {
                    lowerStr += ch;
                }
            }

            System.out.println("Lowercase string: " + lowerStr);
        }
    }

