//p-7.Write a java program to get the length of a given string
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        System.out.print("Enter contents: ");
        Scanner in = new Scanner(System.in);
        String  str = in.nextLine();
        int len = str.length();
        System.out.println("Lenght of String "+str+" is "+len);
    }
}
