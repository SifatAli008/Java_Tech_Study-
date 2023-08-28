//Write a Java program to find second largest number from the array
import java.util.Scanner;

public class P12 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Size of array: ");
    int size = in.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int SecandMax = Integer.MIN_VALUE;


    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        SecandMax = max;
        max = arr[i];
      }
      
      if (arr[i] < max && arr[i] > SecandMax) {
        SecandMax = arr[i];
      }
    }

    System.out.println("Secand largest value: "+SecandMax);

  }
}
