import java.util.*;
public class Min_Abs_Pair {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int min_diff = 0;
        for (int i = 0; i<A.length; i++) {
            min_diff += Math.abs(A[i] - B[i]);
        }
        System.out.println(min_diff);
    }
}
