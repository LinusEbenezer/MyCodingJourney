package MyCodingJourney.Java.Day_1;
// String Formatting in Java.
public class StringFormatting {
    public static void main(String[] args) {
        String name = "Linus";
        int age = 24;
        String language = "Java";
        System.out.println(String.format("Hello %s! You are %d years old and you love %s.", name, age, language));

         double pi = 3.14159;
        System.out.println(String.format("Pi to 2 decimal places: %.2f", pi));
    }
}