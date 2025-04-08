import java.util.Scanner;
public class Questi5 {

    public static void main(String[] args) {


        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Read matrix elements from user
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter element at position [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find the largest value
        int largest = matrix[0][0]; // Start with first element

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        // Print the matrix
        System.out.println("\nThe matrix you entered:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Print the largest value
        System.out.println("\nThe largest value in the matrix is: " + largest);

        // Close the scanner
        scanner.close();
    }
}