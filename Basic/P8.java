//Write a Java program to convert a binary number to decimal number
import java.util.Scanner;

public class P8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Binary Number: ");
        int binary = input.nextInt(); //1010
        int decimal = 0;
        int reminder ;

        int i = 1; 
        while(binary!=0){ // 1010 !=  0; T
                          // 101  !=  0; T
                          // 10   !=  0; T
                          // 1    !=  0; T
                          // 0    !=0 ;F

          reminder = binary%10; //  1010%10 => 0;
                                //   101%10 => 1 ;
                                //    10%10 => 0 ;
                               //      1%10 => 1 ;


          decimal = decimal + reminder*i;// decimal = 0 + 0 * 1;=> 0
                                         //         = 0 + 1 * 2;=> 2
                                         //         = 2 + 0 * 4;=> 2
                                         //         = 2 + 1 * 8;=> 10 // println("10")

           i = i * 2;                   // i = 1 * 2 => 2;
                                        //   = 2 * 2 => 4;
                                        //   = 4 * 2 => 8;
                                        //   = 8 * 2 => 16;

           binary = binary /10;         // binary = 1010/10 => 101;
                                        // binary = 101/10 => 10;
                                        // binary = 10/10 => 1;
                                        //binary =  1/10 => 0;
        } 
          System.out.println("Decimal: "+decimal); // 10
    }
}
