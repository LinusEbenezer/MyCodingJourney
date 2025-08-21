package MyCodingJourney.Java.Day_2;
/* 
Write a program that:
Picks a random number between 1 and 10.
Keeps asking the user to guess the number until they guess correctly.
Tells them if their guess is too high or too low.
Ends when they guess the right number and shows how many attempts they took.
*/
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int a = 1 + (int)(Math.random() * 10);
        Scanner in = new Scanner(System.in);
        int b;
        int count = 0;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            b = in.nextInt();
            count++;

            if (b == a) {
                System.out.println("You guessed it right in " + count + " attempt(s)!");
            } else if (b < a) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        } while (b != a);

        in.close();
    }
}



