import java.util.Scanner;

public class conditionalLogic {
    public static void main(String[] args) {

        System.out.print("Enter the value of x: ");
        Scanner in = new Scanner(System.in);

        // Validating input
        if (!in.hasNextDouble()) { // checks whether the next token in the input can be interpreted as a double
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }

        double x = in.nextDouble();
        printLogarithm(x);


    }

    public static void printLogarithm(double x) {
        // flagging a variable
        boolean negativeNumber = (x <= 0.0);

        if (negativeNumber) {
            System.err.println("Error: x must be positive.");
            return; // terminates methode before end
        }

        double result = Math.log(x);
        System.out.println("The log of x is: " + result);
    }
}
