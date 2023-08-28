//P-13.Write a Java program to find second lowest number from the array
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = in.nextInt();
    
        int arr[] = new int[size];
    
        for (int i = 0; i < size; i++) {
          arr[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int Secandmin = Integer.MAX_VALUE;

    
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] < min) {
            Secandmin = min;
            min = arr[i];
          }
          
          if (arr[i] > min && arr[i] < Secandmin) {
            Secandmin = arr[i];
          }
        }
    
        System.out.println("Secand smallest value in array: "+Secandmin);
    
      }
}
