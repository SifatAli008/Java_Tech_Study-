//Write a Java program that reads an positive integer and count the number of digits
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        int temp = number;
        int count=0;

        while(temp!=0){
          temp = temp / 10;
          count++;
        }
        System.out.println("Number of digigts: "+count);
    }
}
