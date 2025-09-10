package MyCodingJourney.Java.Day_4;

import java.util.Arrays;

public class MultiArr {
    public static void main(String[] args) {
        int[][] matrix = {
           {1,2,3},
           {4,5,6},
           {7,8,9}
        };
        Arrays.stream(matrix).forEach(row -> System.out.println(Arrays.toString(row)));

    }
}
