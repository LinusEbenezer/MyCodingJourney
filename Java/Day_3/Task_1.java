package MyCodingJourney.Java.Day_3;
    import java.util.Scanner;
public class Task_1 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] numbers = new int[5]; // array of size 5

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = in.nextInt();
        }

        // Output
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
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

        // Display results
        System.out.println("\nSum of all numbers = " + sum);
        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);

        in.close();
    }
}

