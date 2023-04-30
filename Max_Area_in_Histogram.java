import java.util.*;
public class Max_Area_in_Histogram {
    public static void maxArea(int[] arr) {
        int max = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
                if (s.isEmpty()) {
                    nsr[i] = arr.length;;
                }
                else {
                    nsr[i] = s.peek();
                }
                s.push(i);
            }
            s = new Stack<>();
            for (int j = 0; j< arr.length; j++) {
                while (!s.isEmpty() && arr[s.peek()] >= arr[j]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    nsl[j] = -1;
                }
                else {
                    nsl[j] = s.peek();
                }
                s.push(j);
            }
            for (int k = 0; k< arr.length; k++) {
                int height = arr[k];
                int width = nsr[k] - nsl[k] - 1;
                int currArea = height*width;
                max = Math.max(currArea, max);
            }
            System.out.println("Maximum Area = " +max);
        }
    }
}
