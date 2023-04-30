import java.util.*;

public class OCCURENCE {
    public static void main(String args[]) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of the array :- ");
        for(int i =0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key :- ");
        int key = sc.nextInt();
        FindOccurence(arr, key, 0);
    }

    public static void FindOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i+" ");
        }
        FindOccurence(arr, key, i+1);
    }
}
