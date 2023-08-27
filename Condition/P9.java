//Write a Java program to display the cube of the number upto given an integer
import java.util.Scanner;

public class P9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Cube of "+i+" : "+i*i*i);
        }
    }
}
