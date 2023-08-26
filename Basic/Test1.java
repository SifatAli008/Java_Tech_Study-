import java.util.Scanner;

public class Test1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double num1 = in.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = in.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = in.nextDouble();
        System.out.print("The average value is " + average(num1, num2, num3)+"\n" );
    }
 
  public static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
}
