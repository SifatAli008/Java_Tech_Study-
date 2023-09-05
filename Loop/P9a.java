import java.util.Scanner;

public class P9a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        int num, positive, negative, zero;
        num = positive = negative = zero = 0;

        do {
            System.out.print("Enter a number: ");
            num = in.nextInt();
            if (num > 0) {
               positive++;
            }
            else if (num < 0) {
                negative++;
            }
            else if(num==0){
                 zero++;
            }
            System.out.print("If you want to countinue then Enter 'Y': ");
             choice = in.next().charAt(0);
             num = 0 ;

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Number of positive Elements: " + positive + "\n" + "Number of Negative Elements: "
        + negative + "\n" + "Number of zero Elements: " + zero);
    }
}
