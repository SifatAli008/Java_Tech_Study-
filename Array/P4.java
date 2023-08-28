//4.Write a Java program to test if an array contains a specific value
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,4,6,8,9,6};

        System.out.println("Enter the NUMBER you want to find: ");
        int num = in.nextInt();
        int flag = 0;
        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
              System.out.println("Found.");
              flag++;
            }
        }
        if(flag==0){
            System.out.println("Not found.");
        }
    }
}
