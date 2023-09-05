//Write a Java program to print multiplication table of given number
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
    }
}
