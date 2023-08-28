//19.Write a Java Program to Sort the Array in an Ascending Order
import java.util.Scanner;
import java.util.Arrays;
public class P19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

    }
}
