//20.Write a Java Program to Sort the Array in Descending Order
import java.util.Scanner;
public class P20 {

    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int  arr[] = new int[size];

      for(int i = 0; i < size; i++){
           arr[i] = in.nextInt();
      }

      for(int i = 0; i < arr.length; i++){
          for (int j = i+1; j < arr.length; j++){
             if(arr[i]< arr[j]){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
             }
          }
      }

      for(int i = 0; i < arr.length; i++){
          System.out.print(arr[i]+" ");
      }

  }
}