import java.util.*;

public class Insertion_Sort{
    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        InsertSort(arr);
        printArray(arr);
    }

    public static void InsertSort(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            int current = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}