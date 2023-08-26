//Write a Java program to count the number of even and odd elements in a given array
import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class P22 {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int evenCount , oddCount ;
        evenCount = oddCount = 0;

        for(int i = 1; i <=num; i++){
           if(i%2==0){
            evenCount++;
           }
           else if(i%2!=0){
            oddCount++;
           }
        }
        System.out.println("Even count: " + evenCount + " \n odd count: " + oddCount);

    }
}
