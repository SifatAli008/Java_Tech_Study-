//P-2.Write a Java program to convert all characters in a string to lowercase
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter contents: ");
        String str = in.nextLine();
        String strloww = str.toLowerCase();
        
        System.out.println("Original: " + str);
        System.out.println("In lowerCase: " + strloww);
    }
}
