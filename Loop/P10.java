import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;  
        char choice;
         int num;
        do {
            
            System.out.print("Enter value: ");
             num = in.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            System.out.print("If you want to countinue then Enter 'Y': ");
            choice = in.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest Number: " + max + "\n" + "Smallest Number: " + min + "\n");
    }
}
