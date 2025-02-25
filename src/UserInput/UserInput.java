package UserInput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("your age is " +age);
    }
}
