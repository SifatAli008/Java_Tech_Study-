//Write a Java program to convert a decimal number to binary numbers
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a Decimal value: "); 
      int decimal = input.nextInt();//4
      int binary[] = new int[100];

      int i = 0;
      while (decimal!= 0) //4!=0 T , 2!=0 T, 1!=0 T, 0!=0 F;
      {
        binary[i]=decimal%2;//  binary[0]= 4%2 = 0 ,
                            //   binary[1]= 2%2 = 0 ,
                            //   binary[1]= 1%2 = 1 , 

        decimal=decimal/2;// decimal = decimal / 2 = 4 / 2 => 2
                          // decimal = decimal / 2 = 2 / 2 => 1
                          // decimal = decimal / 2 = 1 / 2 => 0.5

        i++;//0+1=1, 1+1=2 , 1+2=3 
      }

      System.out.print("Binary value is: ");
      for(int j=i-1; j>=0; j--){ //j = 3 - 1  = 2
                                 //j = 2 - 1  = 1
                                 //j = 1 - 1  = 0

       System.out.print(""+binary[j]);// binary[2] = 1 , binary[1] = 0 , binary[0] = 0;


      }

    }
}
