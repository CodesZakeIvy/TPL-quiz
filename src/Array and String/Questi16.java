import java.util.Scanner;

public class Questi16 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] A = new int[3][3];
            int[][] B = new int[3][3];
            int[][] C = new int[3][3];

            System.out.println("Enter matrix A (3x3):");
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter matrix B (3x3):");
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Matrix multiplication
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    for(int k=0; k<3; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("Result of A*B:");
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

