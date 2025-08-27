package MyCodingJourney.Java.Day_2;
import java.util.Scanner;
public class Task_17 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String fruit = in.next();
  switch (fruit) {
           case "mango"  -> System.out.println("king of fruits");
           case "guva"   -> System.out.println("seed fruits");
           case "grapes" -> System.out.println("small fruits");
           default       -> System.out.println(" please enter a valid value");
       } 
       in.close();
    } 
}