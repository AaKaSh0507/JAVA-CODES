import java.util.*;

public class New_Year_Meet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i = 0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        int arr1[] = BubbleSort(arr);
        int diff1 = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];
        int min = diff1 + diff2;
        System.out.println(min);
    }

    public static int[] BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}