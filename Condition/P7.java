//Write a program in Java to display the first 5 natural numbers
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }
}
