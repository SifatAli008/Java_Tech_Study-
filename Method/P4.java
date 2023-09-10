//p-4.Write a Java method to count all vowels in a string
import java.util.Scanner;

public class P4 {

    public static int vowel(String str) {
        int count = 0;
        int i = 0;
     
        while(i<str.length()){
            if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'|| str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
            i++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int result = vowel(word);
        System.out.println("Number of vowel: " + result);
    }

}