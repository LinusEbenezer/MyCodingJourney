package MyCodingJourney.Java.Day_1;
// Personal Info.
/* Write a Java program that:
Asks the user for their full name, age, and favorite programming language
Prints this in the format:
Hello [Name]! You are [Age] years old and you love [Language]. */

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String name = in.nextLine();
    System.out.print("Enter your age: ");
    int age = in.nextInt();
    in.nextLine(); // Consume the newline character
    System.out.print("Enter your favorite programming language: ");
    String language = in.nextLine();
    System.out.println("Hello " + name + "! You are " + age + " years old and you love " + language + ".");
    in.close();

}
    
}
