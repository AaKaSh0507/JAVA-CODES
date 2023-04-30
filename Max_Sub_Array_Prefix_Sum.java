import java.util.*;

public class Max_Sub_Array_Prefix_Sum {
    public static void main(String args[]) {
        int num[] = { 1, -2, 6, -1, 3 };
        maxSubArray(num);
    }

    public static void maxSubArray(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        int prefix[] = new int[num.length];
        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int j = 0; j < num.length; j++) {
            int start = j;
            for (int k = j; k < num.length; k++) {
                int end = j;
                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Max Sum is :- " + max_sum);
    }
}