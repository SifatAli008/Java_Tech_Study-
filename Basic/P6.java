import java.util.Scanner;

//Write a Java program to swap two variables
public class P6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

     System.out.print("Enter First Variable: ");
     int num1 = input.nextInt();

     System.out.print("Enter First Variable: ");
     int num2 = input.nextInt();
     int temp = 0;

      temp = num1;
      num1 = num2;
      num2 = temp;

      System.out.println();

      System.out.println("First Number: "+num1);

      System.out.println("Second Number: "+num2);
    }
}
