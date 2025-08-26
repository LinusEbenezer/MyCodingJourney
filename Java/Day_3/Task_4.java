/* old code
package MyCodingJourney.Java.Day_3;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        result(in, array);
         in.close();
    }
        static void result( Scanner in, int[] array) {
        int Sum = 0;
        int Average = 0;
        char Grade;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = in.nextInt();
            Sum += array[i];
            System.out.println("Total="+Sum);
            Average = Sum / array.length;
            System.out.println("Average="+Average);
            if (Average >= 90) {
                Grade = 'A';
            } else if (Average <= 89 && Average >= 75) {
                Grade = 'B';
            } else if (Average < 75 && Average >= 60) {
                Grade = 'C';
            } else {
                Grade = 'F';
            }
            System.out.println("Grade=" + Grade);
       
        }
      }  
    }
*/  //improved code
package MyCodingJourney.Java.Day_3;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] marks = inputMarks(in);          // Method to input marks
        int total = calculateTotal(marks);     // Method to calculate total
        double average = calculateAverage(total, marks.length); // Method to calculate average
        char grade = determineGrade(average);  // Method to determine grade

        printResult(total, average, grade);    // Method to print result

        in.close();
    }

    // Input marks
    static int[] inputMarks(Scanner in) {
        int[] marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for subject " + (i+1) + ": ");
            marks[i] = in.nextInt();
        }
        return marks;
    }

    // Calculate total
    static int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Calculate average
    static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    // Determine grade
    static char determineGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'F';
    }

    // Print results
    static void printResult(int total, double avg, char grade) {
        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
}
