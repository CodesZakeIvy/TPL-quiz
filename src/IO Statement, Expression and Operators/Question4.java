import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Write a JAVA program which is used to solve the following formula
        //				F=ma

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mass(kg)");
        System.out.println("Enter the acceleration(m/s^2)");

        double mass= sc.nextDouble();
        double acceleration = sc.nextDouble();

       double force = mass * acceleration;

        System.out.println("The force is " + force +  " Newtons");
    }
}
