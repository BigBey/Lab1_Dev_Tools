public class Trapeze implements GeometricalFigure{

    private double a;
    private double b;
    private double c;
    private double d;

    public Trapeze(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getPerimeter() {
        return a+b+c+d;
    }

    public double getSquare() {
        return (a+b)/2*Math.sqrt(c*c-(((b-a)*(b-a)+c*c-d*d)/(2*(b-a)))*(((b-a)*(b-a)+c*c-d*d)/(2*(b-a))));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
