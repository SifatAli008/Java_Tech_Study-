//Write a Java program to sum values of an array
import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr [] = new int[size];

        int sum = 0;
        for(int i = 0; i < size; i++){
            arr[i]=in.nextInt();
        }

        for(int i = 0; i < size; i++){
            sum+=arr[i];
        }

       System.out.println("Sum of arry Element : "+sum);
        
    }
}