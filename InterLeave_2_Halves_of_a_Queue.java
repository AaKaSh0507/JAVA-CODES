import java.util.*;

public class InterLeave_2_Halves_of_a_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=10; i++) {
            q.add(i);
        }
        interLeave(q);
        while (!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }
        System.out.println();
    }
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size/2; i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
}