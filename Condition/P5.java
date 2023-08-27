//Write a Java program that takes a year from user and print whether that year is a leap year or not
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }
    }
}
