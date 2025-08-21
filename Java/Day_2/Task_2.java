package MyCodingJourney.Java.Day_2;
/*
Write a program that:
Keeps asking the user to enter a number.
Adds all the numbers together into a total.
Stops when the user enters 0.
Prints the final total.
*/
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int total = 0;
        int count = 0;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = in.nextInt();

            if (num != 0) {
                total += num;
                count++;
            }
        } while (num != 0);

        System.out.println("Total of " + count + " entered values: " + total);
        in.close();
    }
}

    

