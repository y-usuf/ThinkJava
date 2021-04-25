import java.util.Scanner;

public class fermatTheorem {

    public static void checkFermat(int a, int b, int c, int n) {

        boolean equation = (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) );
        // Checks to prove Fermat's theorem
        if (n > 2 && equation) {
            System.out.println("Holy smoke, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

    public static void main(String[] args) {

        int a, b, c, n;
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();
        System.out.print("n: ");
        n = in.nextInt();

        checkFermat(a, b, c, n);

    }
}
