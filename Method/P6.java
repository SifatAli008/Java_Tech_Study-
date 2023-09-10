//P6.Write a Java method to check whether an year (integer) entered by the user is a leap year or not
import java.util.Scanner;

public class P6 {
    public static void leapyear(int num){
         if(num%4==0){
            System.out.println(num+" is leap year.");
         }
         else{
           System.out.println(num+" is not a leap year.");
         }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year  = in.nextInt();
         leapyear(year);

    }
}
