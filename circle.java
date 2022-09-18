public class circle extends shape {

    private double radius;
    
    public static double PI = 3.1416;

    public circle(int x, int y, double radius) {
        super(0, 0, new point(x, y));
        this.radius = radius;
        }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void scale(double s) {
        radius = s * radius;
    }

    @Override
    public String toString() {
        point a = getP();
        return a.toString() + "radius = " +radius;
    }

    public void moveLeft(int d) {
        getP().moveLeft(d);
    }

    public void moveRight(int d) {
        getP().moveRight(d);
    }

    public void moveUp(int d) {
        getP().moveUp(d);
    }

    public void moveDown(int d) {
        getP().moveDown(d);
    }
    
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
}