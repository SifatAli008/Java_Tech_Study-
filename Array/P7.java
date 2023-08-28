//7.Write a Java program to reverse an array of integer values
import java.util.Scanner;

public class P7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size = in.nextInt();
        int arr [] = new int[size];// size 5

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt(); // 1 2 3 4 5
        }
        int temp =0;

        for(int i = 0; i < arr.length/2; i++){
             temp = arr[i];
            arr[i]  = arr[arr.length - 1 - i];//5-1-0=4 ; 5-1-1=3 ;5-1-2=2 ; 5-1-3=3 ; 5-1-4=0
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("Array elements is reverse order: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
