package MyCodingJourney.Java.Day_1;
// String Formatting in Java.
public class StringFormatting {
    public static void main(String[] args) {
        String name = "Linus";
        int age = 24;
        String language = "Java";
        String formattedString = String.format("Hello %s! You are %d years old and you love %s.", name, age, language);
        System.out.println(formattedString);
    }
}