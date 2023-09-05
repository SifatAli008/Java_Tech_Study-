//Write a Java program to find the factorial value of any number entered through the keyboard
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int fact = 1;

        for(int i = num; i >= 1; i--){
           fact *=  i;
        }
        System.out.println(fact);
    }
}
