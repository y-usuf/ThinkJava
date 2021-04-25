import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {

        int figure, offset;

        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        figure = in.nextInt();
        System.out.printf("Your guess is: %d\n", figure);


        // Program picks a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1; // picks randomly between 1 and 100 both inclusive
        // System.out.println(number);


        System.out.printf("The number I was thinking of is: %d\n", number);
        offset = Math.abs(number - figure);
        System.out.printf("You were off by: %d", offset);
    }
}
