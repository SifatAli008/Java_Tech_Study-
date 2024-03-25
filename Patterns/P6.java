//6. Mirrored Right Triangle Star Program
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
