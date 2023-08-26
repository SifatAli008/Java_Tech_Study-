//Write a Java program to print the even numbers from 1 to 20
import java.util.Scanner;

public class P17 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            if(i%2==0)
            {
              System.out.println(i);
            }
        }
    }
}
