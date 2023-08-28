
//Question no-3
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of the elements of the array:");

        int n = input.nextInt();

        int a[] = new int[n];
        System.out.println("Elements of the array:");

        for (int i = 0; i < n; i++) {

            a[i] = input.nextInt();

        }

        System.out.println("Enter a perticular number you want to count the occurance:");

        int x = input.nextInt();

        for (int i = 0; i < n; i++) {

            if (a[i] == x) {

                count++;
            }
        }
        System.out.println("occurance no of the digit:" + count);
    }
}
