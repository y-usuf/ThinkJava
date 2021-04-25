// Takes in two user input values and sums them up

import java.util.Scanner; // program uses class scanner

public class Addition {
    // main method begins execution of java application
    public static void main(String[] args)
    {
        // create a scanner to obtain input from user
        Scanner input = new Scanner(System.in);

        int number1; // first number
        int number2; // second number
        int sum; // sum of the two numbers

        System.out.print("Enter first integer: "); // prompt user
        number1 = input.nextInt(); // reads first number from user

        System.out.print("Enter second integer: "); // prompt user
        number2 = input.nextInt(); // reads second number from user

        sum = number1 + number2; // adds the two and stores total in sum

        System.out.printf("Sum is %d%n", sum); // displays sum

    }

}
