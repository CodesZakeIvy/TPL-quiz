public class Quest7b {
    public static void main(String[] args) {
//  Write a JAVA language program which prints the series of prime numbers up to 10 terms.

        int count = 0, num = 2;

        System.out.println("First 10 prime numbers:");
        while(count < 10) {
            if(isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    }

