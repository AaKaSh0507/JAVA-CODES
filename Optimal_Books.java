import java.util.*;

public class Optimal_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int num_of_books = sc.nextInt();
            int price[] = new int[num_of_books];
            for(int j =0; j<num_of_books; j++){
                price[j] = sc.nextInt();
            }
            System.out.println(Algorithm(num_of_books, price));
        }
    }

    public static int Algorithm(int num_of_books, int[] price) {
        int start = 0;
        int end = num_of_books - 1;
        int left_sum = 0;
        int right_sum = 0;
        int max = 0;
        while(start <= end) {
            if(left_sum == right_sum && start > 0){
                max = num_of_books - end + start - 1;
            }
            if(left_sum == right_sum) {
                left_sum = left_sum + price[start];
                start++;
            }
            else if(left_sum > right_sum) {
                right_sum = right_sum + price[end];
                end--;
            }
            else {
                left_sum = left_sum + price[start];
                start++;
            }
        }
        if(left_sum == right_sum){
            max = num_of_books;
            return max;
        }
        return max;

    }
}
