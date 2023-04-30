import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean result = Palindrome(num);
        if (result == true) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not Palindrome number");
        }
    }

    public static boolean Palindrome(int num) {
        int temp = num;
        int num1 = num;
        int reverse = 0;

        while (num > 0) {
            temp = num % 10;
            reverse = (reverse * 10) + temp;
            num = num / 10;
        }

        if (reverse == num1) {
            return true;
        } else {
            return false;
        }
    }
}