import java.util.*;;

public class DoornamePLATE {
    public static void main(String args[]) {
        String g_name;
        String h_name;
        String l_input;
        Scanner sc = new Scanner(System.in);
        g_name = sc.nextLine();
        h_name = sc.nextLine();
        l_input = sc.nextLine();
        String s = g_name+h_name;
        char arr[] = s.toCharArray();
        char arr1[] = l_input.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        // System.out.println(arr.length);
        // System.out.println(arr1.length);
        if (Arrays.equals(arr, arr1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
