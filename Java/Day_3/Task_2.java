package MyCodingJourney.Java.Day_3;
import java.util.Scanner;
    public class Task_2 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 3 students, 3 subjects (2D array)
        int[][] marks = new int[3][3];

        // Input marks
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = in.nextInt();
            }
        }

        // Calculate total marks for each student
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks of Student " + (i + 1) + " = " + total);
        }

        in.close();
    }
}


