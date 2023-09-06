//P4-Write a Java program to trim a string(remove whitespaces)
import java.util.Scanner;

public class P4 {
        public static void main(String[] args) {
            Scanner  in = new Scanner(System.in);
            String str = "        AKIL";
            String removeSpace = str.trim();
            
            System.out.println("Original: " + str);
            System.out.println("After Removeing Space: " + removeSpace);
        }
}
