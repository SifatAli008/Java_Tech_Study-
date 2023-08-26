//Write a Java program to add two numbers without using any arithmetic operators
//Sum of 2 number using logic gate.
import java.util.Scanner;

public class P25ad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // 5
        int b = in.nextInt(); // 1
        int carry = b,sum = 0;
                                               
        while (carry != 0) {        
              
          sum =a^b;        // xor gate
          carry=(a&b)<<1; // ( and gate ) left shift

          a = sum; 
          b = carry; 
            

        }
        System.out.println("Sum : " + sum);
        System.out.println("carry : " + carry);
    }
}
