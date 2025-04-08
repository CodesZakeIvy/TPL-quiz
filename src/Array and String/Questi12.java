public class Questi12 {
    public static void main(String[] args) {
        //    Write a JAVA program which read an array of 10 integer values and
        //    find the largest number with its position.

        int [] array = {3,5,7,9,9,9,2,4,0,2};
        int largest = array[0];
        int position = 0;

        for(int i = 0; i< array.length; i++){
            if(array[i] >= largest){
                largest = array[i];
                position = i;


            }



        }
        System.out.println("The largest number is " + largest + " and the index position is " + position);
    }
}
