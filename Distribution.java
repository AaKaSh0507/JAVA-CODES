import java.util.*;

public class Distribution {
    public static void main(String args[]){
        int N, m;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        m = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Distribute(arr, m);
    }

    public static void Distribute(int arr[], int m){
        int m1 = m;
        int diff;
        int min = Integer.MAX_VALUE;
        int num[] = new int[m];
        for(int i= 0; i<arr.length; i++){
            int start = i;
            int end = m;
            for(int j = start; j<end; j++){
                num[j] = arr[j];
            }
            diff = num[end - 1] - num[0];
            if(diff < min){
                min = diff;
            }
        }
        System.out.println(min);
    }
}
