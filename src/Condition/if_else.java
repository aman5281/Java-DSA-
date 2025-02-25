package Condition;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
//        Find the largest number

//        Scanner sc = new Scanner(System.in);

//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//
//        if(a>b) {
//            System.out.println("a is larger than b");
//            if(a>c){
//                System.out.println("a is the larger than c");
//                System.out.println("a is the largest number "+a);
//            }else{
//                System.out.println("c is the larger than a");
//                System.out.println("c is the largest "+c);
//            }
//        }else {
//            System.out.println("b is the larger than a");
//            if(b>c){
//                System.out.println("b is the larger than c ");
//                System.out.println("b is the largest number "+b);
//            }else {
//                System.out.println("c is the larger than b ");
//                System.out.println("c is the largest number "+c);
//            }
//        }

//    =========================Switch Statement============================
//        System.out.println("Enter the day");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Today is Sunday");
//                break;
//            case 2:
//                System.out.println("Today is Monday");
//                break;
//            case 3:
//                System.out.println("Today is Tuesday");
//                break;
//            case 4:
//                System.out.println("Today is Wednesday");
//                break;
//            case 5:
//                System.out.println("Today is Thursday");
//                break;
//            case 6:
//                System.out.println("Today is Friday");
//                break;
//            case 7:
//                System.out.println("Today is Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");


                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter the value of n:");
                        int n = scanner.nextInt();

                        // Printing stars vertically
                        System.out.println("Stars printed vertically:");
                        for (int i = 0; i < n; i++) {
                            System.out.println("*");
                        }

                        // Printing stars horizontally
                        System.out.println("Stars printed horizontally:");
                        for (int i = 0; i < n; i++) {
                            System.out.print("*");
                        }

                        scanner.close();
                    }
                }



