package MyCodingJourney.Java.Day_1;
/* create four variables:
  a byte variable set it to a value of your choice
  a short variable set it to a value of your choice
  an int variable set it to a value of your choice
  a long variable make it equal to 500000 plus 10 timea the sum of the values of the first 3 variables.
  */
public class Task5 {
    public static void main(String[] args) {
        byte myByte = 10; 
        short myShort = 100;
        int myInt = 1000; 
        
        long myLong = 500000 + 10 * (myByte + myShort + myInt);
        
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
    }
    
}
