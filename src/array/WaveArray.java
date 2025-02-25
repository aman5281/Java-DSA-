package array;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[]={5,7,8,9,0,1,23,4};
//        Wavearray(a);
        nonlexoArray(a);
        printArray(a);
    }

//    For lexographically order
    static void Wavearray(int a[]){
        Arrays.sort(a);
        int n= a.length;
        for(int i=1;i<n;i+=2) {
            swap(a, i, i - 1);
        }
    }

//    For non lexographically order

    static void nonlexoArray(int a[]){
        int n=a.length;

        for (int i=1;i<n;i+=2){
            if (a[i]>a[i-1]){
                swap(a,i,i-1);
            }
            if (i<n-1 && a[i]>a[i+1]){
                swap(a,i,i+1);
            }
        }
    }


    static void swap(int a[], int i, int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void printArray(int a[]){
        for(int e:a){
            System.out.print(e+" ");
        }
    }

}
