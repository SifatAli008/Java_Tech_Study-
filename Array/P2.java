//2.Write a Java program to find the index of an array element
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = { 10, 12, 5, 6, 12, 3, 7, 8 };

        System.out.print("Enter the value , whice index you want to find: ");
        int num = in.nextInt();
        int Position, count = 0;

        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                Position = i;
                System.out.printf("the posistion of '%d' is : %d\n", num, Position);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("This is number is not Available in this Array.");
        }
    }
}