import java.util.*;

public class Ass2_Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array :- ");
        size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the array elements :- ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(RepeatorDistinct(num)); 
    }

    public static boolean RepeatorDistinct(int num[]) {
        int cases = 1;
        switch (cases) {
            case 1:
                for (int i = 0; i < num.length; i++) {
                    for (int j = i + 1; j < num.length; j++) {
                        if (num[i] == num[j]) {
                            return true;
                        }
                    }
                }
            default:
                return false;
        }
    }
}
