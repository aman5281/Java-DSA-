package Recursion;

public class josephus {
    public static void main(String[] args) {
        System.out.println(joseph(5,3));

    }
    static int joseph(int n, int k){
        if(n==1) return 0;
        return (joseph(n-1,k)+k)%n;
    }
}
