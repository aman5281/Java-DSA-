package Loops;

import java.util.Scanner;

public class WhilLoop {
    public static void main(String[] args) {
//        int i=0;
        Scanner sc=new Scanner(System.in);
        boolean hasLearnt=false;
        while(!hasLearnt){
            System.out.println("Went To School");
            System.out.println("Have Learnt");
            hasLearnt=sc.nextBoolean();
        }
    }
}
