package Recursion;

public class Fibbo {
    public static void main(String[] args) {
//        System.out.println(fibboNum(5));
        System.out.println(factorial(5));
    }


    static int fibboNum(int n){
        if(n==0 || n==1) return n;
        return fibboNum(n-1)+ fibboNum(n-2);
    }

     static int factorial(int n){
        //You can code here
        if(n==1) return n;
        return n*factorial(n-1);

    }
}

