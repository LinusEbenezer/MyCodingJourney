package MyCodingJourney.Java.Day_2;

public class TernaryOperator {
    public static void main(String[] args) {
   int ageOfClient = 20; 
    String eligibility = (ageOfClient >= 18) ? "Eligible to vote" : "Not eligible to vote";
    System.out.println("you are " + eligibility);
}
}