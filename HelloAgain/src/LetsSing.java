
public class LetsSing {

    public static void countDown(int n) {
        String moja = " bottles of beer on the wall,";
        String mbili = " bottles of beer,";
        String tatu = "ya' take one down, ya' pass it around,";
        String nne = " bottles of beer on the wall.";

        if (n == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no bottles of beer on the wall!");
        } else {
            stanzas(n, moja, mbili, tatu, nne);
            countDown(n-1);
        }
    }

    public static void lineOne(int n, String moja) {
        System.out.println(n + moja);
    }

    public static void lineTwo(int n, String mbili) {
        System.out.println(n + mbili);
    }

    public static void lineThree(String tatu) {
        System.out.println(tatu);
    }

    public static void lineFour(int n, String nne) {
        System.out.println(n-1 + nne);
        newLine();
    }

    public static void newLine() {
        System.out.println();
    }

    public static void stanzas(int n, String moja, String mbili, String tatu, String nne) {

        lineOne(n, moja);
        lineTwo(n, mbili);
        lineThree(tatu);
        lineFour(n, nne);
    }

    public static void main(String[] args) {
        countDown(5);

    }
}
