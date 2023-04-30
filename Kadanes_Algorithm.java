import java.util.*;

public class Kadanes_Algorithm{
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(num);
    }

    public static void Kadanes(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i = 1; i<num.length; i++){
            current_sum = current_sum + num[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println(+max_sum);
    }
}