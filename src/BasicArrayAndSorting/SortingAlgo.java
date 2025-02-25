package BasicArrayAndSorting;

public class SortingAlgo {
    public static void main(String[] args) {
    int a[]={9,5,3,1,2};
    bubbleSort(a);
    for (int e:a){
        System.out.print(e+" ");
    }
    }
    static void bubbleSort(int a[]){
        int n=a.length;
        for (int i = 0; i < n-1; i++) {
            boolean didIswap=false;
            for (int j = 0; j <n-i-1; j++) {
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                    didIswap=true;
                }
            }
            if(!didIswap) break;
        }
    }
}
