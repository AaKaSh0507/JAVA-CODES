import java.util.LinkedList;
public class LinkedListJCM {
    public static void main(String[] args) {
        // create - object (not int, float, strings but --> INTEGER, FLOAT, STRINGS
        LinkedList<Integer> ll = new LinkedList<>();

        //add

        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        System.out.println(ll);

        // remove

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
