package MyCodingJourney.Java.Day_4;

public class Task_2 {
public static void main(String[] args) {
  printDayOfWeek(6);  
}
public static void printDayOfWeek(int day){
String DayOfWeek=switch (day) {
    case 0 -> {yield "Sunday";}
    case 1 ->"Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    default -> "Invalid Day";
};
System.out.println(day+ " stand for " + DayOfWeek);
}
}
