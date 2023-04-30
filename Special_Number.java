import java.util.*;

public class Special_Number {
    public static void main(String args[]) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            int digits = sc.nextInt();
            sc.nextLine();
            String number = sc.nextLine();
            funcCall(number, digits);
        }

    }
    public static void funcCall(String number, int digits) {
        String answer = "";
        char ch;
        int count = 0;
        for(int i=0; i<digits; i++){
            ch = number.charAt(i);
            if(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9'){
                answer = answer + ch;
                count++;
            }
            if(count==2){
                break;
            }
        }
        if( count == 2){
            System.out.println(answer);
        }
        else {
            System.out.println("-1");
        }
    }
}
