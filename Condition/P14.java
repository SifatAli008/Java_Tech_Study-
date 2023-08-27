//Write a Java program that accepts three numbers and check All numbers are equal or not
import java.util.Scanner;

public class P14 {
   public static void main(String[]args){
     Scanner input = new Scanner (System.in);
     int num1 = input.nextInt();
     int num2 = input.nextInt();
     int num3 = input.nextInt();

    if(num1==num2 && num2==num3){
        System.out.println("Equal.");
    }
    else{
        System.out.println("Not Equal.");    
    }
   }
}
