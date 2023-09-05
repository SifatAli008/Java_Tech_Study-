// Write a Java program to calculate HCF of Two given numbers using loop
import java.util.Scanner;


public class P8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();
        int hcf = 0;

        for(int i = 1; i <= num1 || i<=num2; i++){
            if(num1%i==0&&num2%i==0){
                hcf = i;
            }
        }
       System.out.println("HCF of " + num1 + " and "+num2 +" : "+hcf);
    }
}
