package MyCodingJourney.Java.Day_4;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        dontKnow(5,7,9);
        muttiDontknow(3,6,"tt");
    }
    public static void dontKnow(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void muttiDontknow(int a, int b, String ...v){
        System.out.println(a +" , "+ b +Arrays.toString(v));
    }

}
