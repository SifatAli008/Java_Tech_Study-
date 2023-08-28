//21.Write a Java Program to Sort Names in an Alphabetical Order
import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String names[] = new String[size];

        for(int i = 0; i < names.length; i++){
             names[i]=in.nextLine();
        }

        for(int i = 0; i < names.length ; i++){
            for(int j = i+1; j < names.length; j++){
                if(names[i].compareTo(names[j])>0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }
            }
       }
       for(int i = 0; i < names.length; i++){
         System.out.println(names[i]);
       }
       

    }
}
