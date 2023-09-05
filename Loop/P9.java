import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of value: ");
        int n = in.nextInt();
      

        int num,positive, negative, zero;
        num=positive = negative = zero = 0;

        int i = 1;
        while (i <= n) {
            num = in.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else if (num == 0) {
                zero++;
            }
            i++;
            num = 0;
        }
        System.out.println("Number of positive Elements: " + positive + "\n" + "Number of Negative Elements: "
                + negative + "\n" + "Number of zero Elements: " + zero);
    }
}
