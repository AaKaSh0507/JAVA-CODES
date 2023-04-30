import java.util.*;

public class Sigree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxcal = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        int sum = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (sum >= maxcal) {
                sum -= q.removeFirst();
            }
            if (sum < maxcal) {
                sum += a[i];
                q.addLast(a[i]);
            }
            if (q.size() > max && sum <= maxcal) {
                max = q.size();
            }
        }
        System.out.println(max);
    }
}
