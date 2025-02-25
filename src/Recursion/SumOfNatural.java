package Recursion;

public class SumOfNatural {
    public static void main(String[] args) {

        System.out.println(sumofNatural(5));

    }

    static int sumofNatural(int n){
        if(n==1){
            return 1;
        }
        else{
            return sumofNatural(n-1)+n;
        }
    }
}
