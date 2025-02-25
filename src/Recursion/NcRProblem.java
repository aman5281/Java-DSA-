package Recursion;

public class NcRProblem {
    public static void main(String[] args) {
        System.out.println(nCr(5,10));
    }
    static int nCr(int n, int r){
        if(n==r || n==1) return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
}
