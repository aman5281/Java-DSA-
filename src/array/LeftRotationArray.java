package array;

public class LeftRotationArray {
    public static void main(String[] args) {
       int a[]={1,2,3,4,5,6,7};
       int b[]={2,3};
       int ans[][]=multipleRotations(a,b);
//
       for(int e[] : ans){
           printArray(e);
           System.out.println();
       }


//       for(int i=0;i<b.length;i++){
//
//       }
//
//       rotateByk(a,3);
//        printArray(a);

    }

    static int [][] multipleRotations(int a[],int b[]){
        int n=a.length;
        int m=b.length;
        int ans[][] =new int[m][n];

        int temp[]=new int[2*n]; //for storing 10 elements in the array

        for (int i=0;i<n;i++){
            temp[i]=a[i];
            temp[i+n]=a[i];
        }

        for(int i=0;i<m;i++){
            int offset=(b[i])%n;
            for(int j=0;j<n;j++){
                ans[i][j]=temp[j+offset];
            }
        }
        return ans;
    }

    static void printArray(int a[]){
        for (int e:a){
            System.out.print(e+" ");
        }
    }
    static void rotateByk(int a[],int k){
        int n=a.length;
        for (int i=0;i<k;i++){
            int temp=a[0];
            for (int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
    }
}
