package Recursion;
import java.util.Scanner;

public class Factorial {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println(factorial(n));
        }
        static int factorial(int n){
            //You can code here
            if(n==1) return n;
            return n*factorial(n-1);

        }
    }

