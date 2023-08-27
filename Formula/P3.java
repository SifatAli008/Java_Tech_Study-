import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the base : ");
        double base = in.nextDouble();
        
        System.out.print("Enter the Hight : ");
        double Hight = in.nextDouble();

        double area = 1/2*Hight*base;

        System.out.println("Area of Triangle : "+area);
    }
}
