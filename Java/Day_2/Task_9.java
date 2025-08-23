package MyCodingJourney.Java.Day_2;
  //  ReverseTriangle Pattern
public interface Task_9 {
 
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {      // Outer loop controls rows
            for (int j = 1; j <= i; j++) {     // Inner loop prints stars
                System.out.print("* ");
            }
            System.out.println();               // Move to next row
        }
    }
}

