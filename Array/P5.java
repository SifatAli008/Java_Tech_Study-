//5.Write a Java program to find the maximum and minimum value of an array
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i =0;i < arr.length;i++) {
            if(max<arr[i])
            {
              max = arr[i];
            }
            if(min>arr[i]){
              min = arr[i];
            }
        }

        System.out.println("Max : " + max + " min : " + min);
    }
}
