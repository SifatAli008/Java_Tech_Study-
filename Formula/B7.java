//BASIC VARIABLE 

public class B7 {

    static int b = 20; // static variable
   // int c = 30;       // instance variable

    public static void main(String[] args) {

        int a = 10;                    // Local variable
        //B7 ref = new B7();            // we need object reference of B7 to access instance variable
        System.out.println(a);       // need nothing to access
        System.out.println(B7.b);   // B7 variable=class name //need class name to access static variable
        //System.out.println(ref.c); //ref works as object reference of B7 to access instance variable
   }

}