package MyCodingJourney.Java.Day_4;

import java.util.Arrays;

public class ArrFiltering {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Arrays.stream(numbers)
      .filter(n -> n > 20)
      .forEach(System.out::println);

    }
}
