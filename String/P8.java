import java.util.Calendar;
public class P8 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print("Current Date and Time :"); 
        System.out.format("%tB %te, %tY%n", cal,cal,cal);
        System.out.format("%tl:%tM %tp%n", cal,cal,cal);
    }
}
