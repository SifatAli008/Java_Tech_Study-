import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter endidng number :");
        int n = input.nextInt();
        int count = 0;
         int sum = 0;
        for (int i = 0; i <= n; i++)
         {
            for (int j = 2; j <= i - 1; j++) {
                if (i%j== 0) {
                    count++;
                    sum = sum + i;
                    break;

                }
            }
           
        }
        System.out.println("Sum of "+count+" Prime number : " + sum);
    }
}
