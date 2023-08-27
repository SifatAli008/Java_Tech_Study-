//Write a java program that accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order.
import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1>num2 && num2>num3) {
          System.out.println("Decreasing");
        }
      else  if(num1<num2 && num2<num3) {
            System.out.println("Increasing");
        }

    }
}
