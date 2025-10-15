package MyCodingJourney.Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Smart Pro Calculator ===");
        System.out.println("Type 'exit' anytime to quit.\n");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println(" +  → Addition");
            System.out.println(" -  → Subtraction");
            System.out.println(" *  → Multiplication");
            System.out.println(" /  → Division");
            System.out.println(" %  → Modulo");
            System.out.println(" ^  → Power");
            System.out.println(" sqrt → Square Root");
            System.out.print("\nEnter your choice: ");

            String operator = in.next();

            // Exit condition
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("👋 Exiting calculator. Goodbye!");
                break;
            }

            double num1 = 0, num2 = 0;

            // For sqrt, only one number is needed
            if (operator.equalsIgnoreCase("sqrt")) {
                System.out.print("Enter a number: ");
                num1 = in.nextDouble();
            } else {
                System.out.print("Enter first number: ");
                num1 = in.nextDouble();
                System.out.print("Enter second number: ");
                num2 = in.nextDouble();
            }

            double result = 0;
            boolean valid = true;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) result = num1 / num2;
                    else {
                        System.out.println("Cannot divide by zero.");
                        valid = false;
                    }
                    break;
                case "%":
                    if (num2 != 0) result = num1 % num2;
                    else {
                        System.out.println("Cannot divide by zero.");
                        valid = false;
                    }
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
                case "sqrt":
                    if (num1 >= 0) result = Math.sqrt(num1);
                    else {
                        System.out.println("Cannot take square root of a negative number.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Try again.");
                    valid = false;
            }

            if (valid)
                System.out.println("Result: " + result + "\n");
        }
        in.close();
    }

}