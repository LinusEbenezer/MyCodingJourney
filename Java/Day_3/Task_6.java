/*package MyCodingJourney.Java.Day_3;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = in.nextInt();
        int[][] marks = inputMarks(in,students);          // Method to input marks
        int total = calculateTotal(marks);     // Method to calculate total
        double average = calculateAverage(total, marks.length); // Method to calculate average
        char grade = determineGrade(average);  // Method to determine grade

        printResult(total, average, grade);    // Method to print result

        in.close();
    }

    // Input marks
    static int[][] inputMarks(Scanner in, int students ) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < marks.length; i++) {
            for (int j=0; j< marks[i].length;j++){
            System.out.print("Enter mark"+(j+1)+ "for Student " + (i+1) + ": ");
            marks[i][j] = in.nextInt();
        }
    }
        return marks;
}

    // Calculate total
    static int calculateTotal(int[][] marks) {
        int sum = 0;
        for (int i=0; i<marks.length;i++){
        for (int j=0; j<marks[i].length;j++) {
            sum += marks[i][j];
        }
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
    static void printResult(int studentNumber, int total, double avg, char grade) {
        System.out.println("\nStudent " + studentNumber + ":");
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
}
*/ 

//Implementation after improvement
package MyCodingJourney.Java.Day_3;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int students = 5;

int[][] marks = inputMarks(in,students);   
int highestTotal = 0, topStudent = -1;
int lowestTotal = Integer.MAX_VALUE, lowStudent = -1;
for (int i = 0; i < students; i++){      // Method to input marks
        int total = calculateTotal(marks[i]);     // Method to calculate total
        double average = calculateAverage(total, marks[i].length); // Method to calculate average
        char grade = determineGrade(average);  // Method to determine grade

        printResult(i+1,total, average, grade);    // Method to print result

  

        if (total > highestTotal) {
            highestTotal = total;
            topStudent = i + 1; // store student number (not index)
        }
        if (total < lowestTotal) {
            lowestTotal = total;
            lowStudent = i + 1; // store student number (not  index)
        }
    }

       in.close();
        System.out.println("\nHighest marks = " + highestTotal + " (by Student " + topStudent + ")");
        System.out.println("\nLowest marks = " + lowestTotal + " (by Student " + lowStudent + ")");
       
    }
    // Input marks
    static int[][] inputMarks(Scanner in, int students ) {
        int[][] marks = new int[students][4];
        for (int i = 0; i < marks.length; i++) {
            for (int j=0; j< marks[i].length;j++){
            System.out.print("Enter mark"+(j+1)+ "for Student " + (i+1) + ": ");
            marks[i][j] = in.nextInt();
        }
    }
        return marks;
}

    // Calculate total
    static int calculateTotal(int[] marks) {
        int Sum= 0;
        for (int j=0; j<marks.length;j++) {
           Sum+= marks[j];
        }
    
        return Sum;
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
    static void printResult(int studentNumber,int total, double avg, char grade) {
        System.out.println("\n--- Student "+ studentNumber+" ---- ");
        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
}
