import java.util.*;

public class TWO_SUM_LEETCODE {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :- ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of the array");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target :- ");
        int target = sc.nextInt();
        System.out.println(TwoSum(arr, target)); 
    }

    public static int[] TwoSum(int arr[], int target) {
        int sum = Integer.MIN_VALUE;
        int[] returnarray = new int[2];
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[] { i, j };
                }
            }
        }
        return returnarray;
    }
}
