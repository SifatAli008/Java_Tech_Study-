
// print hfc of n term of number;
import java.util.Scanner;

public class Test {
  public static void main(String arg[]) {
    {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter  a number :");
      int n = sc.nextInt();

      int input[] = new int[n];
      System.out.println("Enter " + n + " numbers");
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();

      }

      int result = input[0];

      for (int i = 1; i < input.length; i++) {
        result = hcf(result, input[i]);
      }
      System.out.println("HCF=" + result);
    }
  }

  static int hcf(int a, int b) {
    while (b > 0) {
      int temp = b;// 36
                   // 24
      b = a % b; // b = 24 % 36 = 24
                 // b = 36 % 24 = 12
      a = temp;// a = 36
    } //
    return a;
  }
}
