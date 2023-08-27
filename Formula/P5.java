//Java Program to find area of rhombus
import java.util.Scanner;


public class P5 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the value of First Diagonal : ");
       double d1 = in.nextDouble();
       System.out.print("Enter the value of First Diagonal : ");
       double d2 = in.nextDouble();

       double AreaOfRhombus = (d1*d2)/2;

       System.out.println("Area Of Rhombus : "+AreaOfRhombus);
    }
}
