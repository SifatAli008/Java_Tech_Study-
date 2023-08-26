//Write a Java program to add two numbers without using any arithmetic operators
// Sum of 2 number useing algorithm
import java.util.Scanner;

public class P25 {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();

        while(num2!=0){
          num2--;
          num1++;
        }
      System.out.println(num1);

    }
}
