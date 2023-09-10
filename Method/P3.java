//P3.Write a Java method to count all words in a string
import java.util.Scanner;

public class P3 {
    public static int wordcount(String str) {
        int count = 0;
        int i = 0;
        while(i<str.length()){
            if (str.charAt(i)==' ')
            {
                count++;
            }
            i++;
        }
        count++;
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int result=wordcount(word);
        System.out.println("Number of words: " + result);
    }
}
