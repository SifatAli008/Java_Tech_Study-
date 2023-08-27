//hcf of 2 numbers
import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = in.nextInt();
        System.out.print("Enter Second number:");
        int num2 = in.nextInt();

         int hfc=0;
        for(int i = 1; i <=num1||i <=num2; i++) {
            if(num1%i==0 && num2%i==0){// 24%12=0 // 36%12=0
                hfc = i;
            }
        }
          System.out.println(hfc);
    }
}
