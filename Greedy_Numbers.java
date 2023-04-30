import java.util.*;

public class Greedy_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            System.out.println("2");
            int x = n;
            int y = n-1;
            for(int i = 0; i<n-1; i++){
                System.out.println(x + " " + y);
                x = (x+y+1)/2;
                y--;
            }
            t--;
        }
    }
}