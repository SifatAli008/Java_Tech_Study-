//8.Write a Java program to find the common elements between two arrays
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = in.nextInt();

        int arr1[] = new int[size];
        System.out.println("First array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        int arr2[] = new int[size];
        System.out.println("Second array");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = in.nextInt();
        }

        int flag = 0;

        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (temp == arr2[j]) {
                    System.out.println("Common Element : " + arr1[i]);
                    flag++;
                }
            }
        }

        if (flag == 0) {
            System.out.println("There is no common element");
        }

    }
}
