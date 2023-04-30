import java.util.*;

public class Reverse_array {
    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        reverseArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + "");
        }
        System.out.println();
    }

    public static void reverseArray(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = num[last];
            first++;
            last--;
        }
    }
}