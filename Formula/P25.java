//P-25.Java Program To Calculate Power Of Number
import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.print("Enter the value of Base: ");
        int base = in.nextInt();
        System.out.print("Enter the value of Power: "); 
        int power = in.nextInt();

        int powerOfNumber = (int) Math.pow(base, power);

        System.out.println("Power "+power+" of base "+base+" : "+powerOfNumber); 
    }
}
