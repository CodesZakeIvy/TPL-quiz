public class Questi11 {
    public static void main(String[] args) {
        //  Write a JAVA program which read an array of 10 integer values and
        //  print the sum of all those values whose indexes are odd number.

        int [] num = {2,4,6,7,2,6,7,9,0,3};
        int sum= 0;

        for(int i = 0;i< num.length; i++){
            if(i%2==1){
                System.out.print(num[i] + " " );
                sum =  sum + num[i];

            }


        }
        System.out.println();
        System.out.println("The sum of the odd indexes are " + sum);

    }
}
