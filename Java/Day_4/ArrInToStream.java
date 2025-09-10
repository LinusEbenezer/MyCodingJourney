package MyCodingJourney.Java.Day_4;
import java.util.Arrays;
public class ArrInToStream {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        Arrays.stream(numbers).forEach(System.out::println);  // printing in new line 
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " ")); // printing in one row

    }

}
