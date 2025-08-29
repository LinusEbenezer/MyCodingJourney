package MyCodingJourney.Java.Day_3;

public class Task_15 {
    public static void main(String[] args) {
    System.out.println(getDurationString(3945)); 
    System.out.println(getDuraString(65, 45));  
    }
    public static String getDurationString(int seconds){
        int minutes =seconds/60;
        // or return getDurationString(minutes, seconds);
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
   return hours + "h" +remainingMinutes + "m" + remainingSeconds +"s";
    }
    public static String getDuraString(int minutes, int seconds){
        int hours = minutes/60;
        
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
   return hours + "h" +remainingMinutes + "m" + remainingSeconds +"s";
    }
}