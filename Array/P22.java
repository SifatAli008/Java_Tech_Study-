
//Write a Java Program to Display Transpose Matrix
import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = in.nextInt();
        System.out.print("Enter the number of col: ");
        int col = in.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Orginal matrix.");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" Transpose Matrix:");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
