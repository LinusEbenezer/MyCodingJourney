package MyCodingJourney.Java.Day_2;

public class LogicalOperator {
    
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;

        // AND example
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive.");
        }

        // OR example
        if (age < 18 || !hasLicense) {
            System.out.println("You cannot drive.");
        }
    }
}


