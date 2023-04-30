import java.util.*;


public class Maximum_GCD {
    public static void main(String args[]) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int res[] =  new int[t];
        int arr[] = new int[t];
        for(int i = 0; i<t; i++){
            arr[i] = sc.nextInt();
        }
        Calculate_GCD(arr);
    }

    static void Calculate_GCD(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            int num = arr[i]/2;
            System.out.println(num);
        }
    }
}
