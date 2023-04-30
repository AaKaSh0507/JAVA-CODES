import java.util.*;

public class Question1 {

    public static double average(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three n");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double average1 = average(x, y, z);
        System.out.println("The average of hte numbers that are given is " + average1);
    }
}