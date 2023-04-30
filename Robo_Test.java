import java.io.*;
import java.util.*;
public class Robo_Test{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s=br.readLine();
        String t=br.readLine();
        int n=Integer.parseInt(br.readLine());
        int[] list=new int[n];
        for(int i=0;i<n;i++){
            list[i]=Integer.parseInt(br.readLine());
        }
        int l=0;
        int r=s.length()-1;
        while(l<r){
            int mid=l+(r-l+1)/2;
            if(check(cut(list,mid,s),t)){
                l=mid;
            }
            else{
                r=mid-1;
            }
        }
        if(check(cut(list,l,s),t)){
            System.out.println(l+1);
        }
        else{
            System.out.println(l);
        }
    }
    public static String cut(int[] list,int index,String s){
        String r=s;
        for(int i=0;i<=index;i++){
            r=r.substring(0,list[i]-1)+"0"+r.substring(list[i]);
        }
        return r;
    }
    public static boolean check(String s,String t){
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            if(j==t.length())
                return true;
        }
        return false;
    }
}
