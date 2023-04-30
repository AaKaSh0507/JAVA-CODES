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
            // switch(ch){
            //     case '1':
            //     answer = answer + ch;
            //     case '3':
            //     answer = answer + ch;
            //     case '5':
            //     answer = answer + ch;
            //     case '7':
            //     answer = answer + ch;
            //     case '9':
            //     answer = answer + ch;

            //     count++;
            // }
            if(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9'){
                answer = answer + ch;
                count++;
            }
            if(count==2){
                break;
            }
        }
        System.out.println(answer);
    }
}
