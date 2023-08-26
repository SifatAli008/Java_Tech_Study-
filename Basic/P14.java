//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
import java.util.*;
public class P14 {
    public static void main(String[] args) {

        int num;  
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        num = in .nextInt();
        System.out.printf("%d + %d%d  + %d%d%d\n", num, num, num, num, num, num);
       }
}
