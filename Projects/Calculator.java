package MyCodingJourney.Projects;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operator; // store the operator
        System.out.println("=== Welcome to the Smart Calculator ===");
        System.out.println("Type 'exit' to quit anytime.\n");

        while (true) {
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();

            System.out.print("Enter second number: ");
            int num2 = in.nextInt();

            System.out.print("Enter an operator (+, -, *, /, %, or type 'exit'): ");
            operator = in.next();

            // Exit condition
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("👋 Exiting calculator. Goodbye!");
                break;
            }

            switch (operator) {
                case "+":
                    System.out.println("Sum: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Difference: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Product: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Quotient: " + ((double) num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        System.out.println("Remainder: " + (num1 % num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, /, or %.");
            }

            System.out.println(); // for spacing
        }

        in.close();
    }
}


