//P-18.java program to print all unique element in an array

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
     
        System.out.print("Unique elements: ");

        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {         
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(arr[i]+" ");
            }
            
        }

    }
}
