//Write a Java program to add two matrices of the same size
import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
        int arr3[][] = new int[size][size];

        System.out.println("First Array.");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = in.nextInt();
            }
            System.out.println();
        }

        System.out.println("Second Array.");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[i][j] = in.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
