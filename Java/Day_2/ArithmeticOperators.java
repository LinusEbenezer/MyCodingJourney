package MyCodingJourney.Java.Day_2;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 5, b = 2;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // integer division
        System.out.println("a % b = " + (a % b));

        a++;
        System.out.println("After a++: " + a);
        b--;
        System.out.println("After b--: " + b);
    }
}


