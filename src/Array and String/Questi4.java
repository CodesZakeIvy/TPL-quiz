import java.util.Scanner;

public class Questi4 {
    public static void main(String[] args) {
        //  Write a JAVA program which read two sets(A and B) of integer values as
        //  1-D array and find the intersection of these two sets.

        Scanner sc = new Scanner(System.in);

        // Reading first array
        System.out.print("Enter size of Set A: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements of Set A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Reading second array
        System.out.print("Enter size of Set B: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        System.out.println("Enter elements of Set B:");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        // Finding intersection
        System.out.println("Intersection of Set A and Set B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                    break;
                }
            }
        }
    }
}
