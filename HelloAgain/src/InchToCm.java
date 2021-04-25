import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        int inch;
        double cm;
        final double cmPerInch = 2.54;
        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = in.nextInt(); // reads input from keyboard and converts it to an integer

        cm = inch * cmPerInch;
        System.out.print(inch + " inches = ");
        System.out.println(cm + " cm");
        System.out.printf("%d inches = %.3f cm\n", inch, cm); // %d integer value. Format specifier


        /*
        Other examples of format specifiers:
        %d = decimal integer i.e. 12345
        %08d = padded with zeros, at least 8 digits i.e. 00012345
        %f = floating-point i.e. 6.34523424
        %.2f = rounded to 2 decimal places i.e. 6.74
         */
    }
}
