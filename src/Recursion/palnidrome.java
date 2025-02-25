package Recursion;

import java.util.Scanner;

public class palnidrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the palindrome String");
    String s= sc.next();
        System.out.println(ispalindrome(s));
    }
    static boolean ispalindrome(String s){
    return ispalindromeHelper(s,0,s.length()-1);
    }

    static boolean ispalindromeHelper(String s, int l,int r) {
        if(l>=r) return true;
        if(s.charAt(l)==s.charAt(r)){
            return ispalindromeHelper(s,l+1,r-1);
        }
        else{
            return false;
        }
    }
}
