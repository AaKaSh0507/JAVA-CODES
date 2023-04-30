import java.util.*;

public class brute_force {
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

    static int Algorithm(int num, int[] price){
        int n = price.length;
        int ls= 0; 
        int rs = 0;
        int count = 0;
        for(int i =0, j =n-1; i<n && j>=0; i++, j--) {
            int start = price[i];
            int end = price[j];
            ls = ls + start;
            rs = rs + end;
            count+=2;
            if(ls == rs){
                return count;
            }
        }
        return 0;
    }
}
