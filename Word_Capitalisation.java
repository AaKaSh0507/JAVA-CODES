import java.util.*;
import java.io.*;

public class Word_Capitalisation {
    public static void main(String args[]){
        String word;
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        String result = ConvertUpperCase(word);
        System.out.println(result);
    }

    public static String ConvertUpperCase(String word) {
        char a = word.charAt(0);
        if(Character.isUpperCase(a)){
            return word;
        }
        else{
            String f = word.substring(0, 1);
            String r = word.substring(1, word.length());
            f = f.toUpperCase();
            word = f + r;
            return word;
        }        
    }
}
