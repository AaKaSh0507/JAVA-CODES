import java.util.*;

public class Trapping_Rainwater {
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapped(height)); 
    }

    public static int trapped(int height[]) {
        int n = height.length;
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        int right_max[] = new int[n];
        right_max[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j++) {
            right_max[j] = Math.max(height[j], right_max[j + 1]);
        }

        int trapped_water = 0;
        for (int k = 0; k < n; k++) {
            int water_level = Math.min(left_max[k], right_max[k]);
            trapped_water += water_level - height[k];
        }

        return trapped_water;
    }
}