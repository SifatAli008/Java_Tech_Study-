//Java program to find area of circle

import java.util.Scanner;

public class P1{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        float r = in.nextInt();
        
        double area = Math.PI*r*r;

        //double area = 22/7 * r * r; //3.1416*r*r


        System.out.print(area);
        
    }
}