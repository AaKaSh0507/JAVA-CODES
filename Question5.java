import java.util.*;

public class Question5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println(+result);
    }

    public static int sum(int num) {
        int summ, temp;
        summ = 0;
        while (num > 0) {
            temp = num % 10;
            summ = summ + temp;
            num = num / 10;
        }
        return summ;
    }
}
