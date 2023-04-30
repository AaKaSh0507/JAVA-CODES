import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int w = 50;
        double[][] ratio = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        int capacity = w;
        int final_value = 0;
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for (int i = ratio.length; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                final_value += val[idx];
                capacity -= weight[idx];
            } else {
                final_value += (ratio[i][0] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(final_value);
    }
}
