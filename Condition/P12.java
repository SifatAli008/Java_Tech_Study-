//Write a Java program that reads an integer and check whether it is negative, zero, or positive
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number>0){
            System.out.println("Positive number");
        }
        else if (number<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
}
