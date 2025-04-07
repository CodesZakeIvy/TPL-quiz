public class Quest2 {
    public static void main(String[] args) {
        //Write a JAVA language program to print the following series.
        //            1   -1    1   -1    1   -1    1   -1    1   -1    1   -1

        for (int i = 1;i <=12; i++){
            if (i % 2 !=0){
                System.out.println("-1  ");
            }else{
                System.out.println("1   ");
            }
        }
    }
}
