public class Rectangle implements GeometricalFigure{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return 2*a+2*b;
    }

    public double getSquare() {
        return a*b;
    }

    @Override
    public boolean equals(Object obj) {
        return this.a == ((Rectangle)obj).a;
    }
}
