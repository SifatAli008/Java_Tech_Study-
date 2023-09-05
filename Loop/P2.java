//Write a java program to calculate the sum of first 10 natural number using loop
import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        int sum = 0;

        for(int i = 1; i <= numbers; i++){
            sum+=i;
        }
        System.out.println(sum);
    } 
}
