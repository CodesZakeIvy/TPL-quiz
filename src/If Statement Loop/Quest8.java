import java.util.Scanner;

public class Quest8 {
    public static void main(String[] args) {
        //Write a JAVA language program which prints the following
        // Fibonacci series up to 10 terms.
        //1    1     2     3     5     8    13     21    34     55

    Scanner sc = new Scanner (System.in);
        System.out.println("Enter number separated by spaces :");

        String[] input = sc.nextLine() .split("");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++){
            nums[i] = Integer.parseInt(input[i]);
        }

        boolean isFibonacci = true;
        for (int i = 2;i <nums.length; i++){
            if (nums[i] != nums[i-1] + nums[i-2])
            {
                isFibonacci = false;
                break;
            }
        }
        if (isFibonacci && nums.length >= 3){
            System.out.println("Yes ! this is a fibonacci sequence");
        }else{
            System.out.println("No,This is NOT a fibonacci sequence");
        }




    }
}
