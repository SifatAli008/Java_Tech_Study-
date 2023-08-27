//Java Program to find area of parallelogram
import java.util.Scanner;

public class P6 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the are lenght:");
        double lenght = in.nextDouble();
        System.out.print("Enter the are Width:");
        double Width = in.nextDouble();

        double area = lenght*Width;

        System.out.println("Area of parallelogram : " + area);
    }
}
