//Write a Java program to find the occurrence/Duplicate values of an array of integer values

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        int count = 0;
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("occurrence Value: " + arr[j] + " ");
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("There is no occurrence Value: ");
        }

    }
}
