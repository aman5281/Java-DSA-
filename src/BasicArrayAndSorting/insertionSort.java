package BasicArrayAndSorting;

public class insertionSort {
    public static void main(String[] args) {
        int a[]={1,6,9,8,5,4};
        insertionSort(a);
        for (int e:a){
            System.out.print(e+" ");
        }
    }
    static void insertionSort(int a[]){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int last=a[i];
            int swapIndex=i-1;

            while (swapIndex>=0 && a[swapIndex]>last){
                swapIndex--;
            }
            int j=i;
            while (j>swapIndex){
                a[j]=a[j-1];
                j--;
            }
            a[swapIndex+1]=last;
        }
    }
}
