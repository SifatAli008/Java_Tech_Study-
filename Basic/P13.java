//Write a Java program to print the ascii value of a given character
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        int asci = (int) ch;

        System.out.printf("Asic value of '%c' is :%d ",ch,asci);
    }
}
