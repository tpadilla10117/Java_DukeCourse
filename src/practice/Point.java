package practice;

public class Point {
    private int x;
    private int y;

/* This is a constructor, note the initialization of a new Point in the main method: */
    public Point(int startx, int starty) {
        x = startx;
        y = starty;
    };

/* 3 methods are below (funtions inside of classes) */
    public int getX() {
        return x;
    };

    public int getY() {
        return y;
    };

    public double distance(Point otherPt) {
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();

        return Math.sqrt(dx * dx + dy * dy);
    };

    public static void main(String[] args) {
        //new keyword creates a new object
        //First [Point] refers to the classname, and the [Point] after the [new] keyword refers to creating a new object of the Pojnt class
        Point p1 = new Point(3, 4); //This is a new instance of the Point constructor
        Point p2 = new Point(6,8);

        System.out.println(p1.distance(p2));
    }
}
