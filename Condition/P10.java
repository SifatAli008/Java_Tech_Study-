//Write a Java program to display the n terms of odd natural number and their sum.
import java.util.Scanner;

public class P10 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int sum = 0;
      for(int i =1;i<=n;i++){
        if(i%2!=0){
            sum=sum+i;
        }
      }
      System.out.println(sum);
    }
}
//1 3 5