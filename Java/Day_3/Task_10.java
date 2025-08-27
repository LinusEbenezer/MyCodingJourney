package MyCodingJourney.Java.Day_3;

public class Task_10 {
    public static void main(String[] args) {
      shouldWakeUp(true, 7);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay<0 || hourOfDay>23) {
            return false;
        }
        return barking && (hourOfDay<8 || hourOfDay>22);
    }
  }