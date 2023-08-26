//Write a Java program and compute the sum of the digits of an integer
import java.util.Scanner;

public class P10 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = input.nextInt();  // 1234
      int total = 0;
      int reminder ;

      while(num!=0){ // 1234 != 0; T
                     // 123 != 0; T
                     // 12 != 0; T
                     // 1 != 0; T
                     // 0 != 0; F

         reminder = num%10; // 1234 % 10 = 4;
                            // 123  % 10 = 3;
                            // 12   % 10 = 2;
                            //  1   % 1  = 1;

         total = total + reminder; // 4 + 3 + 2 + 1= 10

         num = num/10;// 1234 / 10 = 123;
                      // 123  / 10 = 12;
                      // 12   / 10 = 1;
                      //  1   / 10 = 0;
      }
      System.out.print(total);//10
    }
}
