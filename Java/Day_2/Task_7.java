package MyCodingJourney.Java.Day_2;
// Print a rectangle of stars using nested loops
public class Task_7 {
public static void main(String[] args) {
    int rows = 3;
int cols = 5;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        System.out.print("* "); // print star
    }
    System.out.println(); // new line after each row
  }
 }
}