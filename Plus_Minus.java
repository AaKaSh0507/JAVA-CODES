import java.util.*;

public class Plus_Minus {
    public static void main(String args[]){
        int count_neg = 0;
        int count_pos = 0;
        int count_o = 0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                count_neg++;
            }
            else if(arr[i] > 0){
                count_pos++;
            }
            else if(arr[i] = 0){
                count_o++;
            }
        }
        double ratio_pos = count_pos/n;
        double ratio_neg = count_neg/n;
        double ratio_o = count_o/n;
        System.out.println(+ratio_pos);
        System.out.println(+ratio_neg);
        System.out.println(+ratio_o);
    }    
}
