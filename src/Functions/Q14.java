import java.util.Scanner;

public class Q14 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("Enter 10 integers:");
            for(int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter number to search:");
            int search = sc.nextInt();
            int pos = findPosition(arr, search);
            System.out.println("Position: " + (pos != -1 ? pos : "Not found"));
        }

        public static int findPosition(int[] array, int num) {
            for(int i = 0; i < array.length; i++) {
                if(array[i] == num) return i;
            }
            return -1;
        }
    }
