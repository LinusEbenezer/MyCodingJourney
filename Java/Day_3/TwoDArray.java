package MyCodingJourney.Java.Day_3;

public class TwoDArray { 
    public static void main(String[] args) {
        // Create a 2D array with 3 rows and 3 columns
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        for (int i = 0; i < numbers.length; i++) {   // loop rows
            for (int j = 0; j < numbers[i].length; j++) { // loop columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}

