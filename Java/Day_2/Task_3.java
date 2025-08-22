package MyCodingJourney.Java.Day_2;
//calculator program using switch case
import java.util.Scanner;
 public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter value 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        String operator=in.next();
        in.nextLine();
     switch (operator) {
            case "+":
                System.out.println("Sum: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Difference: " + (num1 - num2));                
                break;
            case "*":
             
                System.out.println("Product: " +(num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Quotient: " + (num1 / num2));
                   
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
                break;
        }
        in.close();
    }
    
}
    

