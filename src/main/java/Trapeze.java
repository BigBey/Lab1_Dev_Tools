/**
 * Это класс Trapeze(прямоугольник), он реализует интерфейс GeometricalFigure и имеет поля a,b,c,d(стороны трапеции).
 */
public class Trapeze implements GeometricalFigure{

    private double a;
    private double b;
    private double c;
    private double d;

    /**
     * @return double(геттер)
     */
    public double getA() {
        return a;
    }

    /**
     * @return double(геттер)
     */
    public double getB() {
        return b;
    }

    /**
     * @return double(геттер)
     */
    public double getC() {
        return c;
    }

    /**
     * @return double(геттер)
     */
    public double getD() {
        return d;
    }

    /**
     * @param a
     * @param b
     * @param c
     * @param d
     * конструктор
     */
    public Trapeze(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * @return double(реализация метода double getPerimeter() из интерфейса GeometricalFigure)
     */
    public double getPerimeter() {
        return a+b+c+d;
    }

    /**
     * @return double(реализация метода double getSquare() из интерфейса GeometricalFigure)
     */
    public double getSquare() {
        return (a+b)/2*Math.sqrt(c*c-(((b-a)*(b-a)+c*c-d*d)/(2*(b-a)))*(((b-a)*(b-a)+c*c-d*d)/(2*(b-a))));
    }

    /**
     * @param obj
     * @return boolean(переопределение метода boolean equals() класса Object, чтобы сравнивать фигуры)
     */
    @Override
    public boolean equals(Object obj) {
        return this.a == ((Trapeze)obj).a
                && this.b == ((Trapeze)obj).b
                && this.c == ((Trapeze)obj).c
                && this.d == ((Trapeze)obj).d;
    }
}
