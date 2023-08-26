
//Write a Java program to count the letters, spaces, numbers and other characters of an input string
import java.util.Scanner;

public class P12 {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int letterCount ,numberCount,spaceCount,otherCount;
        letterCount= spaceCount = numberCount = otherCount=0;
    

        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (Character.isLetter(ch)) {
            letterCount++;
          } else if (Character.isWhitespace(ch)) {
            spaceCount++;
          } else if (Character.isDigit(ch)) {
            numberCount++;
          } else {
            otherCount++;
          }
        }
        System.out.println("Letters : "+letterCount);
        System.out.println("Numbers : "+numberCount);
        System.out.println("Spaces  : "+spaceCount);
        System.out.println("Spaces  : "+otherCount);
  
      }
}
