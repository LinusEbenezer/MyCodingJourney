package MyCodingJourney.Java.Day_2;

import java.util.Scanner;

public class While_Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = "";
        
        while (!password.equals("java123")) {
            System.out.print("Enter password: ");
            password = in.nextLine();
        }
        
        System.out.println("Access Granted!");
        in.close();
    }
}

