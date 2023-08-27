import java.util.Scanner;

//Write a Java program to take three numbers from the user and print the greatest number
public class P1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

       if(num1>num2 && num1>num3){
        System.out.println("First number is the greatest number: " + num1);
       }
       else if(num2>num1 && num2>num3){
        System.out.println("Second number is the greatest number: " + num2);
       }
       else if(num3>num1 && num3>num2){
        System.out.println("Third number is the greatest number: " + num3);
       }
    }
}