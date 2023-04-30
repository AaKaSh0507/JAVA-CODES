import java.util.*;

public class Tower_of_hanoi {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks :- ");
        n = sc.nextInt();
        towerofhanoi(n, "A", "B", "C");
    }

    public static void towerofhanoi(int n, String source, String helper, String destination) {
        if(n == 1){
            System.out.println("Transfer disk" +n+ "from" + source+ "to" +helper);
            return;
        }
        towerofhanoi(n-1, source, helper, destination);
        System.out.println("Transfer disk" +n+ "from" + source+ "to" +helper);
        towerofhanoi(n-1, source, helper, destination);
    }
}
