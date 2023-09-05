//Write a java program to print numbers from 1 to 10 using loop
import java.util.Scanner;
public class P1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}