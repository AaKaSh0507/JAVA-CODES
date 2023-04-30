import java.util.*;

public class Counting_Sort {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        CountSort(arr);
        printArray(arr);
    }

    public static void CountSort(int arr[]) {
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest];
        for (int j = 0; j < arr.length; j++) {
            count[arr[j]]++;
        }
        int k = 0;
        for (int l = 0; l < count.length; l++) {
            while (count[l] > 0) {
                arr[k] = l;
                k++;
                count[l]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}