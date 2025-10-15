
// Variable Swapping Without Third Variable
/* Write a Java program that:
Declares two variables a and b with any values
Swaps them without using a third variable
Prints values before and after the swap */
public class Task3 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; 
        b= a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
