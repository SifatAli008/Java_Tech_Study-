import java.util.Scanner;

public class P14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double sum = 0;

        int number = in.nextInt();
        for(int i = 1; i <= number; i++){
           sum += 1.0/i;
        }
        System.out.printf("Sum: %.3f " ,sum);
    }
}
