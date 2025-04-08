import java.util.Scanner;

public class Q7 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("Enter 10 integers:");
            for(int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Largest number: " + findLargest(arr));
        }

        public static int findLargest(int[] array) {
            int max = array[0];
            for(int num : array) {
                if(num > max) max = num;
            }
            return max;
        }
    }

