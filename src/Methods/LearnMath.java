package Methods;

public class LearnMath {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.abs(-5));
        System.out.println(getrandom(10,20));
        System.out.println(Math.floor(5.89));
        System.out.println(Math.ceil(5.89));
        System.out.println(Math.round(5.89));
    }

    public static int getrandom(int a, int b){
//        return (int) (Math.random()*6+1);
        return (int) (Math.random()*(b-a+1) + a);
    }
}
