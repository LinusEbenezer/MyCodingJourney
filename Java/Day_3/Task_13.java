package MyCodingJourney.Java.Day_3;

public class Task_13 {
    public static void main(String[] args) {
       System.out.println("result= "+ areEqualByThreeDecimalPlaces(2.9, 2.7));
    }
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
       long x = (long)(a*1000);
        long y = (long)(b*1000);
      return x==y; 
    
}
}
