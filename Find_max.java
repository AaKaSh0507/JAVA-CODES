import java.util.*;

public class Find_max {
    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 6, 5 };
        int result = findMax(num);
        System.out.println(+result);
    }

    public static int findMax(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }
}