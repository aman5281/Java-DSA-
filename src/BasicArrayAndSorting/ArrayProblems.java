package BasicArrayAndSorting;

public class ArrayProblems {
    public static void main(String[] args) {
        int a[]={2,3,5,6,8,4};
        lastSortedNumber(a);
        for (int e:a) {
            System.out.print(e+" ");
        }

    }
    static void lastSortedNumber(int a[]){
        int n=a.length;
        int last= a[n-1];
        int swapindex=n-2;

        while(swapindex>=0 && a[swapindex]>last){
            swapindex--;
        }
        for (int i = n-1; i>=swapindex+2 ; i--) {
            a[i]=a[i-1];
        }
        a[swapindex+1]=last;
    }
}
