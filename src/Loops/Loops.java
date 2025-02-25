package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        FOR LOOP

//        for(int i=0;i<=5;i++){
//            System.out.println(i);
//        }

//        Table For
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int n= sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(n+" x "+i+" = "+i*n);
//        }

//        Sum of N natural number
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=(i*2);
        }
        System.out.println("Sum is "+sum);


    }
}
