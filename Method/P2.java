//P-2. Write a Java method to find the smallest number among three numbers

import java.util.Scanner;

public class P2 {
    public static int smallest(int a, int b, int c) {
        int min = Integer.MAX_VALUE;

        if(a<b && a<c){
            min = a;
        }
        else if(b<c && b<a){
            min = b;
        }
        else if(c<b && c<a){
            min = c;
        }

        return min;
    }
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       int y = in.nextInt();
       int z = in.nextInt();

       int result=smallest(x,y,z);

       System.out.println("Smallest number is: " + result);
    }
}
