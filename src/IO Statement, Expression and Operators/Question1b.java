import java.util.Scanner;

public class Question1b {
    public static void main(String[] args) {


        // Write a JAVA program to solve the following equation.
        //			F=km1m2/r2
        //Where k is a constant value.

        final double k = 6.67430e-11;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mass of the first object m1 (kgs):");
        double m1 = sc.nextDouble();

        System.out.println("Enter the mass of the second object m2 (kgs) :");
        double m2 = sc.nextDouble();

        System.out.println("Enter the distance between them in meters r (meters) ");
            double r = sc.nextDouble();

            double force  = k*m1*m2 /(r*r);

            if (r == 0){
                System.out.println("Error !! Distance (r) cannot be zero");
                return;
            }

            // Uses printf with %.3e to display the result in
        // scientific notation (e.g., 1.234e-10).

        System.out.printf("Force is : %.3e Newtons%n", force);




    }
}