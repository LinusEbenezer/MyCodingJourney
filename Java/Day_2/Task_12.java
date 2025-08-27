package MyCodingJourney.Java.Day_2;
   import java.util.Scanner;
public class Task_12 {
 

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      char ch = in.next().trim().charAt(0);
       if ((ch >= 'a')&& (ch<='z')) {
           System.out.println("lowercase"); 
        }
       else{
      System.out.println("uppercase");
       }  
       in.close();
     }   
    }
