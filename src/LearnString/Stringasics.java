package LearnString;
import  java.lang.CharSequence;
import java.util.Arrays;

public class Stringasics {
    public static void main(String[] args) {

        int age = 123;
        String stringName = String.valueOf(age);
        System.out.println(age+2); //125
        System.out.println(stringName+2); //1232

        String name = "Java Programming";
//        String Newname = new String("Aman");

        String [] words= name.split("a");
        for (String word:words){
            System.out.println(Arrays.toString(words));
        }

        System.out.println(words.length);
//        System.out.println(name.indexOf("l"));
    }
}
