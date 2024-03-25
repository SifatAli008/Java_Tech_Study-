//4. Diamond Shape Pattern Program in Java
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = num-1; i >= 1; i--) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        in.close();
    }
}
