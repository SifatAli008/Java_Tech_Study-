import java.util.Scanner;

public class test {
    public static void main(String[] arg) {
        System.out.println("Enter number :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }

        System.out.println("result " + sum);
    }
}
