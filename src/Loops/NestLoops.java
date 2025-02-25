package Loops;

public class NestLoops {
    public static void main(String[] args) {
//        for (int count = 0; count < 10; count++) {
//            for (int i = 0; i <= 5; i++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        outerLoop:
        for (int count = 0; count < 10; count++) {
            for (int i = 0; i <= 5; i++) {
                if(i==3) {
                    break outerLoop;
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }

//        Patterns
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }
}
