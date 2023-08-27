//List of Simple Formula Based Java Programs || QES- 3-Java Program to find area of equilateral triangle
import java.util.Scanner;

public class P4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Hight of side leght : ");
        double side = in.nextDouble();

        

        double AreaOfTriang = (Math.sqrt(3)/4)*(side*side);

        System.out.println("The area of equilateral triangle is : "+AreaOfTriang);

    }
}
