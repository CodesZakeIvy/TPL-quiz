import java.util.Scanner;

public class Questi6 {
    public static void main(String[] args) {
        //   Write a JAVA program which read two matrix's A and B
        //   of orders 3*3 and find the A-B.


                Scanner scanner = new Scanner(System.in);

                // Define matrices
                int[][] matrixA = new int[3][3];
                int[][] matrixB = new int[3][3];
                int[][] result = new int[3][3];

                // Input Matrix A
                System.out.println("Enter elements of Matrix A (3x3):");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("A[%d][%d]: ", i, j);
                        matrixA[i][j] = scanner.nextInt();
                    }
                }

                // Input Matrix B
                System.out.println("\nEnter elements of Matrix B (3x3):");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("B[%d][%d]: ", i, j);
                        matrixB[i][j] = scanner.nextInt();
                    }
                }

                // Calculate A - B
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        result[i][j] = matrixA[i][j] - matrixB[i][j];
                    }
                }

                // Display results
                System.out.println("\nMatrix A:");
                printMatrix(matrixA);

                System.out.println("\nMatrix B:");
                printMatrix(matrixB);

                System.out.println("\nResult (A - B):");
                printMatrix(result);

                scanner.close();
            }

            // Helper method to print a matrix
            public static void printMatrix(int[][] matrix) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }

