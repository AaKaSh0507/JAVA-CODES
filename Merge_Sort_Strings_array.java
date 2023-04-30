import java.util.*;

public class Merge_Sort_Strings_array {
    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        String arr[] = new String[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextLine();
        }
        Merge(arr,0, size-1);
    }

    static void Merge(String arr[], int si, int ei){
        int mid = si + (ei-si)/2;
        Merge(arr, si, mid);
        Merge(arr, mid+1, ei);
        MergeFinal(arr, si, mid, ei);
    }

    static void MergeFinal(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1; 
        int k = 0;
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[i++];
        }
        for(k=0, i = si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
}
