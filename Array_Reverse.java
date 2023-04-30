import java.util.*;

public class Array_Reverse {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases :- ");
        int T = sc.nextInt();
        System.out.println("Enter the size of the array :- ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);

    }

    public static void reverse(int arr[]) {
        int b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[arr.length - i - 1];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(b[j]);
        }
    }
}
