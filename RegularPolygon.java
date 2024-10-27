public class RegularPolygon {
    // Private data fields
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // No-arg constructor with default values
    public RegularPolygon() {
    }

    // Constructor with specified number of sides and length of side
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // Constructor with specified number of sides, length of side, and coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutator methods
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}

