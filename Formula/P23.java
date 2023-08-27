//P-23.Java Pogram to Calculate Commission Percentage
import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int amount = in.nextInt();
        System.out.print("Enter Comissions Percentage: ");
        int commissionPer = in.nextInt();

        int commission = amount*commissionPer / 100;

        System.out.println("Comissions: "+commission);
    }
}
