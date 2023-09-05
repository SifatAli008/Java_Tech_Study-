//Write a Java program to check whether the number is a prime number or not
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int count = 0;

        for(int i = 2 ; i < num; i++){
           if(num%i==0){
               count++;
               break;
           }
        }
        if(count>0){
            System.out.println("Not Priem");
        }
        else if(count==0){
            System.out.println("Priem");
        }
    }
}
