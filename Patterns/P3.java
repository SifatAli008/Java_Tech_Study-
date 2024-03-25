//3. Left Triangle Star Pattern
import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
        for(int j = num-1; j >= i; j--){
            System.out.print("  ");
        }
           for(int j = 1; j <= i; j++){
               System.out.print("* ");
           }
           System.out.println(" ");
        } 
        in.close();
   }
}
