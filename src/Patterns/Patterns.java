package Patterns;

public class Patterns {
    public static void main(String[] args) {

        int n = 2;


//        int m = 5;

//        Pattern 1
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Pattern 2
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }


//        Pattern 3
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        Pattern 4
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Pattern 5
//        for(int i=1; i<=n;i++){
//            for (int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern 6
//        for(int i=0; i<n; i++){
//            for(int j=1; j<n-i; j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int j=0; j<=2*i-1; j++){
//                if(j== 2*i-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=n-2;i>=0;i--){
//            for (int j=1; j<n-i;j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int j=0; j<=2*i-1; j++){
//                if(j==2*i-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 7
//        for(int i=0; i<n; i++){
//            for (int j = 0; j < n-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Pattern 8
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        Pattern 9
//        for (int k = 0; k < n-i; k++) {
//            System.out.print(" ");
//            System.out.print(" ");
//        }
//        for (int k = i; k > 0; k--) {
//            System.out.print(" ");
//            System.out.print(k);
//        }
//        if(i>=2){
//            for (int k = 2; k <=i; k++) {
//                System.out.print(" ");
//                System.out.print(k);
//            }

//        Pattern 9
//        int i,j;
//        for(i=1;i<=n;i++) {
//            for(j=1;j<=2*(n-i);j++) {
//                System.out.print(" ");
//            }
//            for(j=i;j>=1;j--) {
//                System.out.print(j+" ");
//            }
//            for(j=2;j<=i;j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        
//        Pattern 10
//        for(int i=1; i<=n; i++){
//            for (int j = 1; j <= n ; j++) {
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }

//        Pattern 12

        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2*n-row : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
