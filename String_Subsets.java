public class String_Subsets {
    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str, "", 0);
    }    

    static void findsubsets(String str, String answer, int i){
        //Base Case
        if(i == str.length()){
            System.out.println(answer);
            return;
        }

        //Recursion
        //Yes Condition
        findsubsets(str, answer+str.charAt(i), i+1);
        //No Condition
        findsubsets(str, answer, i+1);
    }
}
