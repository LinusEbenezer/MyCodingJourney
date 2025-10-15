
// Basic Arithmetic Operations.
/*Write a Java program that:
Takes two integers from the user
Prints their sum, difference, product, quotient, and remainder */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = in.nextInt();
        System.out.print("Enter second integer: ");
        int b = in.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("Division: " + (a / b));
            
        }
        if (b == 0) {
            System.out.println("Remainder by zero is not allowed.");
        } else {
        System.out.println("Remainder: " + (a % b));
        }
        in.close();
    }
}
