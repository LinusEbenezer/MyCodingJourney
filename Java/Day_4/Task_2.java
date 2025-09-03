package MyCodingJourney.Java.Day_4;

public class Task_2 {
public static void main(String[] args) {
  printDayOfWeek(6);  
}
public static void printDayOfWeek(int day){
String DayOfWeek=switch (day) {
    case 0 -> {yield "Sunday";}
    case 1 ->{yield "Monday";}
    case 2 -> {yield"Tuesday";}
    case 3 -> {yield "Wednesday";}
    case 4 -> {yield "Thursday";}
    case 5 -> {yield "Friday";}
    case 6 -> {yield "Saturday";}
    default -> "Invalid Day";
};
System.out.println(day+ " stand for " + DayOfWeek);
}
}
