import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("enter number of rows: ");
         int num = in.nextInt();
         for (int i = num-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= num - 1 - i; j++) {
                if(i==0||i==num-1||j==0||j==num - 1 - i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println(" ");
        }
        in.close();
    }
}
