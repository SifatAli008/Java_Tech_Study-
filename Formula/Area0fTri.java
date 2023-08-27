import java.util.Scanner;

public class Area0fTri {

  public static void main(String[] args) {

    Scanner tri = new Scanner(System.in);

    System.out.println("Enter the value of 1st side:");
    double a = tri.nextDouble();

    System.out.println("Enter the value of 2nd side:");
    double b = tri.nextDouble();

    System.out.println("Enter the value of 3rd side:");
    double c = tri.nextDouble();

    if ((a + b) > c && (b + c) > a && (a + c) > b) {
      double s = (a + b + c) / 2;
      double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      System.out.println("Area of the triangle:" + Area);
    } 
    
    else 
    {
      System.out.println("Area of the triangle not exist!!");
    }

  }
}