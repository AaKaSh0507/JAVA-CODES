import java.util.*;

public class String_Palindrome {
    public static void main(String args[]) {
        String str = "racecar";
         boolean answer = isPalindrome(str);
         System.out.println(answer);
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
