//23.Write a Java Program to Search Key Elements in an Array
import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int [size];

        for(int i = 0; i < arr.length; i++){
            arr[i]=in.nextInt();
        }
          
        int find = in.nextInt();
        int count=0;

        for(int i = 0; i < arr.length; i++){
               if(arr[i]==find){
                 System.out.println(find+" is found in "+i+" position");
                 count++;
               }
        }

        if(count==0){
            System.out.println(find+" is not found in Array element.");
        }


    }
}
