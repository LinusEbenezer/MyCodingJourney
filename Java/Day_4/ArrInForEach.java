package MyCodingJourney.Java.Day_4;

public class ArrInForEach {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
        System.out.println(num);
        }
        String[] fruits = {"Apple", "Banana", "Mango"};

System.out.println("Using normal for loop:");
for (int i = 0; i < fruits.length; i++) {
    System.out.println("Index " + i + ": " + fruits[i]);
}

System.out.println("Using for-each loop:");
for (String fruit : fruits) {
    System.out.println(fruit);
}

    }
}