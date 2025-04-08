import java.util.Scanner;

public class Questi7 {
    public static void main(String[] args) {
        // Write a JAVA program which
        // reads a string and print its length without using strlen() function.



                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                // Directly use the length() method
                int length = input.length();

                System.out.println("Length of the string: " + length);
                sc.close();
            }
        }


