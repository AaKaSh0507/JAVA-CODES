import java.util.*;

public class Palindrome_indiices {

    //Driver Code
    public static void main(String argsp[]) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt(); // Number of test cases
        int arr[] = new int[t]; // To print the result

        // Input the string for each test case
        for(int i = 0; i<t; i++){
            int num_of_char = sc.nextInt();
            String word = sc.nextLine();
            arr[i] = isPalindrome(word);
        }

        //Print the result
        for(int i = 0; i<t; i++){
            System.out.println(arr[i]);
        }
    }

    public static int isPalindrome(String word) {
        int count = -1;
        String result;
        if(word.length() == 1){
            count = 1;
        }
        else if(word.length() == 2){
            count = 2;
        }
        else {
            for(int i = 0; i<word.length(); i++){
                if(i == 0){
                    result = word.substring(i);
                }
                else {
                    result = word.substring(0, i) + word.substring(i+1);
                }
                if(checkPalindrome(result) == true){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean checkPalindrome(String result) {
        String rev = "";
        boolean res = false;
 
        for (int i = result.length() - 1; i >= 0; i--) {
            rev = rev + result.charAt(i);
        }
        if (result.equals(rev)) {
            res = true;
        }
        return res;
    }
}