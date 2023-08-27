//Write a Java program to test a number is positive or negative
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0){
            System.out.println("Positive number");
        }
        else if(num<0){
            System.out.println("Negative number");
        }
    }
}
