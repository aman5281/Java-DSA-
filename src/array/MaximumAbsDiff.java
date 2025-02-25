package array;

public class MaximumAbsDiff {
    public static void main(String[] args) {

        int a[]={1,3,-1};
        System.out.println(maximumDiff(a));

    }
    static int maximumDiff(int a[]){
        int n= a.length;
        int aipi[] =new int[n];
        int aimi[]=new int [n];

        int minaipi=Integer.MAX_VALUE;
        int maxaipi=Integer.MIN_VALUE;

        int minaimi=Integer.MAX_VALUE;
        int maxaimi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            minaipi=Math.min(minaipi,a[i]+i);
            maxaipi=Math.max(maxaipi,a[i]+i);

            minaimi=Math.min(minaipi,a[i]-i);
            maxaimi=Math.max(maxaimi,a[i]-i);
        }

        int diffaipi = maxaipi-minaipi;
        int diffaimi = maxaimi-minaimi;

        return Math.max(diffaipi , diffaimi);
    }

}
