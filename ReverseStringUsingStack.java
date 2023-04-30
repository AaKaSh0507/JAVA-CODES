import java.util.*;
public class ReverseStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while(index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder str1 = new StringBuilder(" ");
        while (!s.isEmpty()) {
            char curr = s.pop();
            str1.append(curr);
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);
    }
}
