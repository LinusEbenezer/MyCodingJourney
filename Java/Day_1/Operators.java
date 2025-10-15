public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); // integer division
        System.out.println("Remainder: " + (a % b));

        double x = 10;
        double y = 3;
        System.out.println("Division (double): " + (x / y));

        // Assignment Operators
        int c = 7;
        c += 3;
        System.out.println("After += 3, c = " + c);
        c *= 2;
        System.out.println("After *= 2, c = " + c);

        // Comparison Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));

        // Logical Operators
        boolean result = (a > b) && (b > 0);
        System.out.println("(a > b) && (b > 0): " + result);
    }
}
