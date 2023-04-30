import java.io.*;
import java.util.*;

public class power_n {

    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            String s = cin.nextLine();
            int ans = 1000000;
            for (int i = 0; i < 62; i++) {
                String p = String.valueOf((long) Math.pow(2, i));
                ans = Math.min(ans, s.length() - get(p, s) + p.length() - get(p, s));
            }
            System.out.println(ans);
        }
    }

    private static int get(String x, String s) {
        int sum = 0;
        for (int i = 0, k = 0; i < x.length() && k < s.length(); k++) {
            if (s.charAt(k) == x.charAt(i)) {
                ++i;
                ++sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        task();
    }

    static class cin {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static StringTokenizer tokenizer = new StringTokenizer("");

        static String nextLine() throws IOException {
            return reader.readLine();
        }

        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

}