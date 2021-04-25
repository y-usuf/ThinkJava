import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in); // declares a scanner variable named in and creates a new scanner that takes and input from Scanner,in

        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type something again: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
    }
}
