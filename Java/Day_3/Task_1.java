package MyCodingJourney.Java.Day_3;
   import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       System.out.print("How many numbers do you want to enter? ");
        int n = in.nextInt();

        int[] numbers = new int[n]; // array size depends on user input

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = in.nextInt();
        }

        // Initialize sum, largest, smallest
        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        // Loop to calculate
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Average (sum / number of elements)
        double average = (double) sum / numbers.length;

        // Display results
        System.out.println("\nSum of all numbers = " + sum);
        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
        System.out.println("Average = " + average);

        in.close();
    }
}