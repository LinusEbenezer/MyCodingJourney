package MyCodingJourney.Java.Day_3;

public class Methods_ {
    public static void main(String[] args) {
        greet(); // method call without parameters
        greetUser("Linus"); // method call with parameter
    }
    static void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java methods!");
    }
}
