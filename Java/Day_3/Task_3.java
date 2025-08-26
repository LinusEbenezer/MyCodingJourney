package MyCodingJourney.Java.Day_3;
import java.util.Scanner;
public class Task_3 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] marks = new int[3][3]; // 3 students, 3 subjects

        // Input marks
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = in.nextInt();
            }
        }

        // Variables to track highest
        int highestTotal = 0;
        int topStudent = -1;

        // Calculate total marks for each student
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks of Student " + (i + 1) + " = " + total);

            // Check if this student has the highest
            if (total > highestTotal) {
                highestTotal = total;
                topStudent = i + 1; // store student number (not index)
            }
        }

        // Show highest
        System.out.println("\nHighest marks = " + highestTotal + " (by Student " + topStudent + ")");

        in.close();
    }
}

