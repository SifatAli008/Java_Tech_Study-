//Write a Java program to get the character at the given index within the String
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int index1 = str1.charAt(0);
        int index2 = str2.charAt(5);

        System.out.println("character it index 0 of str1 is : " +(char) index1);
        System.out.println("character it index 5 of str2 is : " +(char) index2);
    }
}
