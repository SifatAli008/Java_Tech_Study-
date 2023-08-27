//Write a Java program that determines a student’s grade
import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Quiz Score: ");
        int Quiz = input.nextInt();
        System.out.print("Enter your Mid Score: ");
        int Mid = input.nextInt();
        System.out.print("Enter your Final Score: ");
        int Final = input.nextInt();

        int sum = Quiz+Mid+Final;
        Float AvgScore = sum/3f;

        if(AvgScore>=90){
            System.out.println("Student grade = A");
        }
        else if(AvgScore>=70 && AvgScore<90){
            System.out.println("Student grade = B");
        }
        else if(AvgScore>=50 && AvgScore<70){
            System.out.println("Student grade = B");
        }
        else if(AvgScore<70){
            System.out.println("Student grade = F");
        }
    }
}
