package MyCodingJourney.Java.Day_3;

public class MethodReturnValue {
    public static void main(String[] args) {
        int Sum = add(5, 10); // method call and storing return value
        System.out.println("Sum: " + Sum);
    }

    static int add(int a, int b) {
        return a + b; // returning the sum of a and b
    }
}
