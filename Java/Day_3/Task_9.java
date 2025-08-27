package MyCodingJourney.Java.Day_3;

public class Task_9 {
    public static void main(String[] args) {
        toMilesPerHour(25.6);
        printConvertion(88.7);
    }
public static long toMilesPerHour(double kilometersPerHour){
   if (kilometersPerHour < 0){
        return -1;
    } return Math.round(kilometersPerHour/1.609);
     
}
public static void printConvertion( double kilometersPerHour){
  if(kilometersPerHour < 0 ) { 
    System.out.println("Invaid value");
  return;
}
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}