import java.util.*;

public class Contains_Duplicate {
    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array :- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

