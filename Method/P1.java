//Write a Java method to compute the average of three numbers
import java.util.Scanner;

public class P1{

    public static double Average (double a, double b, double c){

        double sum = a+b+c;
        double avg = sum/3;
        return avg;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        double result = Average (x,y,z);

        System.out.println("Avarage of 3 numbers: " + result);
    }

    
}