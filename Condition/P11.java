//Write a Java program to display the multiplication table of a given integer
import java.util.Scanner;

public class P11 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();

       for(int i = 1; i <= 10; i++){
        System.out.println(number+"X"+i+"="+number*i);
       }
    }
}
