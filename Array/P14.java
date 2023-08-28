import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        

        for(int i = 0; i < arr.length; i++){
             arr[i]=in.nextInt();
        }

         System.out.print("All Even :");

        for(int i :arr){
          if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
          }
        }
        
        System.out.println();
        System.out.print("All Odd :");

        for(int i :arr){
            if(arr[i]%2!=0){
              System.out.print(arr[i]+" ");
            }
          }
        
        
    }
}
