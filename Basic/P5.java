import java.util.Scanner;

//Write a Java program that takes five numbers as input to calculate and print the average of the numbers
public class P5 {
    public static void main(String[] args){
     Scanner input = new Scanner (System.in);
     System.out.print("Enter number of value: ");
     int n = input.nextInt();
     int total = 0;

     for(int i = 1; i <= n; i++){
        System.out.print(i+" Number : ");
        int num = input.nextInt();
        total = total + num;
     }

     int avg = total / n;
     System.out.println();
     System.out.println("Average : "+avg);

    } 
}
