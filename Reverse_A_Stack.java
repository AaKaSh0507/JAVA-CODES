import java.util.*;
public class Reverse_A_Stack {
    public static void push_At_Bottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        push_At_Bottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        printStack(s);
        reverseStack(s);
        printStack(s);
    }
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        push_At_Bottom(s, top);
    }
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
