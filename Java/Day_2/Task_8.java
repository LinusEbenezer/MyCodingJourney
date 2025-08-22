package MyCodingJourney.Java.Day_2;
//Print a triangle of stars using a Nested for loop
public class Task_8 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        // Outer loop -> controls the rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop -> prints stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star with a space
            }
            System.out.println(); // Move to next row after inner loop finishes
        }
    }
}
