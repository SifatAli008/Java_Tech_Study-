//3.Write a Java program to calculate the average value of array elements
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter Array Elemets: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / size;
         
        System.out.println("Avarage of all array elements: "+avg);
    }
}
