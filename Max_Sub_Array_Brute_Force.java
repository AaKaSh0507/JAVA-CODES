import java.util.*;

public class Max_Sub_Array_Brute_Force {
    public static void main(String args[]) {
        int num[] = { 1, -2, 6, -1, 3 };
        SubArraySum(num);
    }

    public static void SubArraySum(int num[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum += num[k];
                }
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println(max_sum);
    }
}