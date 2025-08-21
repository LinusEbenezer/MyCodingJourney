package MyCodingJourney.Java.Day_1;

public class Task7 {
    public static void main(String[] args) {
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F'; 
        char myDecimalChar = 63;
        System.out.println("Simple Char: " + mySimpleChar);
        System.out.println("Unicode Char: " + myUnicodeChar);
        System.out.println("Decimal Char: " + myDecimalChar);
        System.out.println("My values are equal: " + (mySimpleChar == myUnicodeChar && mySimpleChar == myDecimalChar));
    }
}
