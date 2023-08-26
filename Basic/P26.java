//Write a Java program to add all the digits of a given positive integer
import java.util.Scanner;

public class P26 {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt(); 

      int reminder, sum=0;
    
      while(num!=0)
      {
         reminder = num % 10;
         sum = sum + reminder;
         num = num / 10;
      }
      System.out.println("sum:"+sum);

    }
}
