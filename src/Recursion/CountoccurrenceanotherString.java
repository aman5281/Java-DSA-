package Recursion;

import java.util.Scanner;

public class CountoccurrenceanotherString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String :");
    String s =sc.next();
        System.out.println("Enter the substring to search in the string :");
    String t=sc.next();
        System.out.println(countOccurrence(t,s));
    }
    static int countOccurrence(String t,String s){
    return countOccurenceHelper(t,s,0);
    }

    static int countOccurenceHelper(String t, String s,int i){
        if(i>s.length() - t.length()){
            return 0;
        }
        int subproblemAnswer = countOccurenceHelper(t,s,i+1);
        boolean doCharMatch = s.substring(i,i+t.length()).equals(t);

        if (doCharMatch) return subproblemAnswer+1;
        else return subproblemAnswer;
    }
}
