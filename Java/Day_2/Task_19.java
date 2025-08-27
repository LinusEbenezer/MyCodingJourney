package MyCodingJourney.Java.Day_2;

public class Task_19 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0) {
            System.out.println("Invalid Value");            
        }
    int xx=kiloBytes;
    int yy= xx/1024 ;
    int zz = xx%1024;
    System.out.println(xx + "KB = " + yy + "MB and " + zz + "KB");
}
}
