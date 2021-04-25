import java.util.Scanner;

public class CelsiusToFar {
    public static void main(String[] args){
        double degCel, degFar;

        Scanner in = new Scanner(System.in);

        // prompt user for an input in degrees celsius
        System.out.print("What is the current temperature in Celsius: ");
        degCel = in.nextDouble();  // read and store a double value input

        // Calculating the results and displaying
        degFar = ((degCel * 9 / 5.0) + 32);
        System.out.printf("%.1f C = %.1f F", degCel, degFar);


    }
}
