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
     switch (operator) {
            case "+":
                System.out.println("\nSum: " + (num1 + num2));
                break;

            case "-":
                System.out.println("\nDifference: " + (num1 - num2));                
                break;
            case "*":
             
                System.out.println("\nProduct: " +(num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("\nQuotient: " + ((double)num1 / num2));
                   
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case "%":
                if (num2 != 0) {
                    System.out.println("\nRemainder: " + (num1 % num2));
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
    

