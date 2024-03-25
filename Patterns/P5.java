//5. Downward Triangle Star Pattern
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num = in.nextInt();
        for (int i = num ; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        in.close();
    }
}
