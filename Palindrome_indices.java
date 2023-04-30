import java.util.*;

public class Palindrome_indices{
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            int len_word = sc.nextInt();
            String word = sc.next();

            arr[i] = calulate_Count(word,len_word);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }

    static int calulate_Count(String str, int len){
        int mid = len/2;
        int count = 1;
        for(int i= mid; i<len; i++){
            if(i+1<len && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else
            break;
        }
        for(int i = mid; i>=0; i--){
            if(i-1>=0&& str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else
            break;
        }
        return count;
    }
}