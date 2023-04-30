import java.util.*;
import java.lang.*;
import java.io.*;
class malik {
    public static int solution(int arr[], int n) {
        TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for (int i = 0; i<n; i++) {
            if(!h.containsKey(arr[i])) {
                h.put(arr[i], 1);
            }
            else {
                h.put(arr[i], h.get(arr[i] + 1));
            }
        }
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(Map.Entry<Integer, Integer> e:h.entrySet()) {
            if(e.getValue() < min) {
                min = e.getValue();
                res = e.getKey();
            }
        }
        return res;
    }
}
public class LargeButMinFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                malik k = new malik();
                System.out.println(k.solution(arr, n));
            }
        }
    }
}
