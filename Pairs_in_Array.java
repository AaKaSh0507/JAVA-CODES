import java.util.*;

public class Pairs_in_Array {
    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        PairArray(num);
    }

    public static void PairArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.println("(" + current + "," + num[j] + ") ");
            }
        }
        System.out.println();
    }
}