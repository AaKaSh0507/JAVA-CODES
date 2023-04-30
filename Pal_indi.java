//Time Limit Exceeded
import java.util.Scanner;

public class Pal_indi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            int len_word = sc.nextInt();
            String word = sc.next();

            arr[i] = calulate_Count(word);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }

    static int calulate_Count(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String str = removeIndex(word, i);
            if (isPalindrome(str) == true) {
                count++;
            }
        }
        return count;
    }

    static String removeIndex(String word, int i) {
        String str1 = word.substring(0, i) + word.substring(i + 1);
        return str1;
    }

    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }
}
