import java.util.HashSet;
import java.util.Scanner;

public class Questi13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of set A: ");
            int sizeA = sc.nextInt();
            int[] setA = new int[sizeA];
            System.out.println("Enter elements of set A:");
            for(int i=0; i<sizeA; i++) {
                setA[i] = sc.nextInt();
            }

            System.out.print("Enter size of set B: ");
            int sizeB = sc.nextInt();
            int[] setB = new int[sizeB];
            System.out.println("Enter elements of set B:");
            for(int i=0; i<sizeB; i++) {
                setB[i] = sc.nextInt();
            }

            HashSet<Integer> union = new HashSet<>();
            for(int num : setA) union.add(num);
            for(int num : setB) union.add(num);

            System.out.println("Union of A and B: " + union);
        }
    }

