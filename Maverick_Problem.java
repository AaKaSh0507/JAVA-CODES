import java.util.*;

public class Maverick_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int height[] = new int[size];
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }
        Arrays.sort(height);
        CalculatePoints(size, height);
    }

    static void CalculatePoints(int size, int height[]) {
        int arr1[] = new int[size/2];
        int arr2[] = new int[(size+1)/2];
        int count = 0;
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = height[i];
        }
        for(int i = size/2, j=0; i<size; i++, j++){
            arr2[j] = height[i];
        }
        int[] answer = new int[size];
        for(int i =0, j = 0, k = 0; i<size; i++){
            //to fill odd positions
            if(i%2 == 1) {
                answer[i] = arr1[j];
                if(i != size-1){
                    count++;
                }
                j++;
            }
            else {
                answer[i] = arr2[k];
                k++;
            }
        }
        System.out.println(count);
        for(int i = 0; i<size; i++){
            System.out.println(answer[i]);
        }
    }
}