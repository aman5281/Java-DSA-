package Methods;

public class LearnMethod {
    public static void main(String[] args) {
    average(5,7,true);
    }

    public static void average(int a, int b, boolean ShouldAvg){
        int avg = (a+b)/2;
        System.out.println("The Average of "+a+" & "+b+" is "+avg);

    }
}
