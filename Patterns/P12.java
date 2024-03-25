//12. Alphabet A Pattern
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter EVEN number of rows: ");
        int num = in.nextInt();
        for(int i = 1; i <= num/2; i++){
           for(int j = 1; j <= num/2; j++) {
             if(i==1||j==1||j==num/2||i==num/2){
                   System.out.print("*");
             }
             else{
                  System.out.print(" ");
             }
           }
        System.out.println(" ");
        }

        for(int i = 1; i <= num/2; i++){
            for(int j = 1; j <= num/2; j++) {
              if(j==1||j==num/2){
                    System.out.print("*");
              }
              else{
                   System.out.print(" ");
              }
            }
         System.out.println(" ");
         }
        in.close();
    }
}
