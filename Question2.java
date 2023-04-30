import java.util.*;

public class Question2 {

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        boolean result = isEven(a);
        System.out.println("The result is :- " + result);
    }
}
