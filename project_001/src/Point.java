public class Point {  // Declaration for a class called point
    // Declaring field x and y; private - only code in this class can manipulate these fields
    private int x;
    private int y;

    // Declaration of a constructor - specify how to create object of this class; initialises object
    // named as a function - no return type - named same as class
    public Point(int startx, int starty){
        x = startx;
        y = starty;
    }

    // Declaration of three methods; getX, getY and distance - method: function inside a class
    public int getX(){ return x;}
    public int getY(){ return y;}

    public double distance(Point otherPt){
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
}
