public class String_Permutations {
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }

    static void findPermutation(String str, String ans){
        // Base Case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String str1 = str.substring(0, i) + str.substring(i+1);
            findPermutation(str1, ans+curr);
        }
    }
}
