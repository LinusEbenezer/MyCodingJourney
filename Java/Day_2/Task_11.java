package MyCodingJourney.Java.Day_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value 1: ");
        int a = in.nextInt();
         System.out.print("Enter the value 2: ");
        int b = in.nextInt();
        System.out.print("Enter the value 3: ");
        int c = in.nextInt();

        
        // Q: find the largest number
       // int max = a;
       // if(b > max){
         //   max = b;
       // }
        //if (c > max){
          //  max = c;
        //}
        System.out.println("The Max value is: " + Math.max(Math.max(a,b),c));
        in.close();
    }
}

