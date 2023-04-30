import java.util.*;

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int a[] = new int[test_cases];
        for (int i = 0; i < test_cases; i++) {
            int len = sc.nextInt();
            String word = sc.next();

            a[i] = func_count(word,len);
        }
        for (int i = 0; i < test_cases; i++) {
            System.out.println(a[i]);
        }
    }

    public static int func_count(String str, int length){
        int mid = length/2;
        int count = 0;
        for(int i= mid; i<length; i++){
            if(i+1<length && str.charAt(i-1) == str.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}
