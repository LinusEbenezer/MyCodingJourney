package MyCodingJourney.Java.Day_3;

  import java.util.Scanner;
  public class Arrays_ {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] numbers = new int[5]; // array of size 5

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = in.nextInt();
        }

        // Output
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        in.close();
    }
}


