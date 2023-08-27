//Write a java program to check vowel or consonant
import java.util.Scanner;


public class P8 {
       public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);

    if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z')
    {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {
            System.out.println("Vowel");
        }
         else {
            System.out.println("Consonant");
        }
    }
    else{
        System.out.println("Not a Alphabat.");
    }
  }
}

