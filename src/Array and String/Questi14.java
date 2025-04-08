import java.util.Scanner;

public class Questi14 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matrix = new int[3][3];

            System.out.println("Enter 3x3 matrix elements:");
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int max = matrix[0][0];
            int row = 0, col = 0;

            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(matrix[i][j] > max) {
                        max = matrix[i][j];
                        row = i;
                        col = j;
                    }
                }
            }

            System.out.println("Largest value: " + max);
            System.out.println("Position: [" + row + "][" + col + "]");
        }
    }

