//Write a Java Program to Accept the Marks of a Student and find Total Marks and Percentage
import java.util.Scanner;
public class P24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        double sum = 0; 

        for(int i = 0; i < arr.length; i++){
            arr[i]=in.nextInt();
           sum +=arr[i];
        }
 
        double Percentage = sum/size;

        System.out.println("Total: " + sum);
        System.out.println("Percentage: " + Percentage);
    
    }
}
