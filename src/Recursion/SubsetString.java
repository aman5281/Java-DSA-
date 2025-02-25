package Recursion;

public class SubsetString {
    public static void main(String[] args) {
    String s="abc";
    AllSubstring(s);
    }
    static void AllSubstring(String s){
    AllSubstringHelper(s,0,"");
    }
    static void AllSubstringHelper(String s,int i,String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        AllSubstringHelper(s,i+1,cur+s.charAt(i));
        AllSubstringHelper(s,i+1,cur);
    }
}
