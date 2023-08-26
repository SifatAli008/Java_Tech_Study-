import java.util.Scanner;

//Write a Java program to check if a positive number is a palindrome or not
public class P24 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

         int reminder,temp,sum = 0;
         System.out.print("Enter any Number: ");
         int num = input.nextInt();

          temp = num;
         while(temp!=0){
          reminder = temp % 10;
          sum = sum * 10+reminder;
          temp = temp / 10;
         }

         if(num==sum){
            System.out.println("Palindrome");
         }
         else{
            System.out.println("Not a Palindrome");
         }
    }
}
