
public class TwoPointDistance {
    public static void main(String[] args) {
        // inputs
        double rad = radius(1.0, 2.0, 4.0, 6.0);
        double area = calculateAreaOfACircle(rad);
        System.out.println(rad);
        System.out.println(area);
        System.out.println(isSingleDigit(rad));  // checks whether the radius is a single digit

    }

    // method calculates the magnitude between tow points (xc, yc) and (xp, yp)
    public static double radius(double xc, double yc, double xp, double yp) {
        double dx = xp - xc;
        double dy = yp - yc;

        return Math.sqrt((dx * dx) + (dy * dy));  // returns a double distance
    }

    // Finds the area of a circle
    public static double calculateAreaOfACircle (double radius) {
        return Math.PI * radius * radius;
    }

    // Boolean methods - returns true if the statement holds
    public static boolean isSingleDigit(double x) {
        return x > -10 && x < 10;
    }

}
