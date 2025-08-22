package MyCodingJourney.Java.Day_2;
// Multiplication table program
import java.util.Scanner;
public class Task_4 {
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        in.close();
    }
}


