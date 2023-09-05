//Write a Java program that reads a set of integers, and then prints the sum of the even and odd integers using loop
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sumofeven = 0;
        int sumofodd = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sumofeven += i;
            } 
            else if (i % 2 != 0) {
                sumofodd += i;
            }
        }
        System.out.println("Sum of even : " + sumofeven);
        System.out.println("Sum of odd : " + sumofodd);

    }
}
