//P5-Write a Java method to compute the sum of the digits in an integer
import java.util.Scanner;

public class P5 {
    public static int sumofdigit(int n) {
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = sumofdigit(num);
        
        System.out.println("Sum of " + num + " is : " + result);
    }
}
