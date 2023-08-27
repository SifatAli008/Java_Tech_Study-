//Write a Java program to input 5 numbers from keyboard and find their sum and average
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            int num = 0;
            System.out.print("Enter the value of " + i + " Number : ");
            num = input.nextInt();
            sum += num;
            i++;
        }
        System.out.println("Sum of " + n + " numbers : " + sum);
        System.out.println("Average of " + n + " numbers : " + sum / n);
    }
}
