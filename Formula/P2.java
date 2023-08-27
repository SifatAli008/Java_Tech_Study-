//Java Program to find area of rectangle
import java.util.Scanner;


public class P2 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);

       System.out.print("Enter the lenght of rectangle: ");
       double lenght = in.nextDouble();

       System.out.print("Enter the Width of rectangle: ");
       double widht = in.nextDouble();

        double AreaofRectangle = lenght*widht;
       
        System.out.println("Area of rectangle : "+AreaofRectangle);
    }
}
