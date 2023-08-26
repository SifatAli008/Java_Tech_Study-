//Write a Java program to compare two numbers
import java.util.Scanner;

public class P11 {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the first Number: ");
     int num1 = input.nextInt();

     System.out.print("Enter the first Number: ");
     int num2 = input.nextInt();

     if(num1 == num2){
         System.out.println("First Number: "+num1+" == "+"Second Number: "+num2);
     }

    else if(num1 != num2){
        System.out.println("First Number: "+num1+" != "+"Second Number: "+num2);
        System.out.println("And");
        
       if(num1 > num2){
            System.out.println("First Number: "+num1+" > "+"Second Number: "+num2);
        }
    
        else if(num1 < num2){
            System.out.println("First Number: "+num1+" < "+"Second Number: "+num2);
        }
    }

    

 }
    
}
