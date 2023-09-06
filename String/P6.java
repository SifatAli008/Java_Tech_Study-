//Write a Java program to replace all the ‘d’ characters with ‘f’ characters
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter contents: ");
        String str = in.nextLine();
        String newStr = str.replaceFirst("S", "R");
    
        System.out.println("Original String: " + str);
        System.out.println("New String: " + newStr);
    }
}
