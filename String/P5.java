import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String str = in.nextLine();
        String newstr = str.substring(6, 9);
        
        System.out.println("Original: " + str);
        System.out.println("Create a substring from Original: " +newstr);
    }
}
