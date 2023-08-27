//Write a Java program to create a simple calculator
import java.util.Scanner;

public class P17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();

        
        System.out.println("1.Addition. ");
        System.out.println("2.Substraction. ");
        System.out.println("3.Multiplication. ");
        System.out.println("4.Division. ");
        System.out.println("5.Quantification. ");
        System.out.print("Chose the Arithmatic operator: ");
        int oprater = input.nextInt();

        switch (oprater){
            case 1:
             int Addition = num1+num2;
             System.out.println("Addition: "+Addition);
            break;
            case 2:
             int Substraction = num1-num2;
             System.out.println("Substraction: "+Substraction);
            break;
            case 3:
             int Multiplication = num1*num2;
             System.out.println("Multiplication: "+Multiplication);
            break;
            case 4:
             int Division = num1/num2;
             System.out.println("Division: "+Division);
            break;
            case 5:
             float Quantification = num1%num2;
             System.out.println("Quantification: "+Quantification);
            break;
            default:
               System.out.println("Invalid Input");
        
        }


    }
}
