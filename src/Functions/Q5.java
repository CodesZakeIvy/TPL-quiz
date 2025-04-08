public class Q5 {

        public static void main(String[] args) {
            System.out.println("Sum of 1 to 10: " + sumRecursive(10));
        }

        public static int sumRecursive(int n) {
            if (n == 1) return 1;
            return n + sumRecursive(n - 1);
        }
    }

