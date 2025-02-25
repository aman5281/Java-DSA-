package array;

public class MinSubArr {

    public static void main(String[] args) {

        int a[]={1, 2, 5, 6, 7, 2};
        int target= 7;
        System.out.println(minSumArr(a,target));
    }

    static int minSumArr(int a[], int target){
        int l=0 , r=0;
        int x=-1 , y=-1; // For returning indices of the answer
        int curSum=0;
        int n=a.length;
        int minLength= Integer.MAX_VALUE;

        while (r < n){
            curSum += a[r];
            while (curSum >= target){

                minLength = Math.min(minLength,r-l+1);

//                if(r-l+1<minLength){ // For printing the indices in the Array.
//                    minLength =r-l+1;
//                     x=l;
//                     y=r;
//                }
                curSum -= a[l];
                l++;
            }
            r++;
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        System.out.println(x+" "+y);
        return minLength;
    }
}
