//Write a Java program that prompts the user to input an integer and then outputs the number with the digits reversed order
import java.util.Scanner;

public class P5 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
         
        int temp = num;
        int rev;
        while(temp!= 0 ){
         rev = temp%10;
         System.out.print(rev);
         temp = temp/10;
        }
    }
}
