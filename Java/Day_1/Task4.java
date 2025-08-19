package MyCodingJourney.Java.Day_1;
// Task 4: User Input and String Formatting
import java.util.Scanner;
public class Task4 {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your Height in meters: ");
        double height = Double.parseDouble(in.nextLine());
        System.out.print("Enter your weight in Kg: ");
        double weight = Double.parseDouble(in.nextLine());
        System.out.println(String.format("%s is %.2f meters tall and %.2f kg.", name, height, weight));
        in.close();
    }
}


