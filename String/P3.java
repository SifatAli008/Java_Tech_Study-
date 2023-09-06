//P3-Write a Java program to convert all characters in a string to uppercase
import java.util.Scanner;


public class P3 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter contents: ");
        String str = in.nextLine();
        String strup = str.toUpperCase();
        
        System.out.println("Original: " + str);
        System.out.println("In UpperCase: " + strup);
    }
}
