package MyCodingJourney.Java.Day_4;

public class Task_3 {
    public static void main(String[] args) {
        for(double rate=7.5; rate<=10.0; rate += 0.25){
            double interestAmount = calculateInterest(10000.0,rate);
            System.out.println("10,000 at "+rate+ "% interest"+ interestAmount);
        }
        }
        public static double calculateInterest(double amount, double interestrate){
            return (amount*(interestrate/100));
        }
    }
