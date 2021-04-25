import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double cmPerInch = 2.54;
        final int inchPerFoot = 12;
        Scanner in = new Scanner(System.in);

        // Prompt the user and get the value
        System.out.print("How many cm? ");
        cm = in.nextDouble();

        // Convert and output the result
        inches = (int) (cm / cmPerInch);
        feet = inches / inchPerFoot;
        remainder = inches % inchPerFoot;

        System.out.printf("%.2f cm = %d ft, %d inches\n", cm, feet, inches);
    }
}
