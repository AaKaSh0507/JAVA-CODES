import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG {
    private static int call_avg(String S){
        int sum = 0;
        for(int i = 0; i<S.length(); i++){
            sum = sum + (int)S.charAt(i);
        }
        return sum/S.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            String S = sc.next();
            int result = call_avg(S);
            double avg = Math.floor(result);
            System.out.println(avg);
        }
    }
}
