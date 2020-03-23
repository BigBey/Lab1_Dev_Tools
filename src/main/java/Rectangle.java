/**
 * Это класс Rectangle(прямоугольник), он реализует интерфейс GeometricalFigure и имеет поля a,b(стороны прямоугольника).
 */
public class Rectangle implements GeometricalFigure{

    private double a;
    private double b;

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
     * @param a
     * @param b
     * конструктор
     */
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * @return double(реализация метода double getPerimeter() из интерфейса GeometricalFigure)
     */
    public double getPerimeter() {
        return 2*a+2*b;
    }

    /**
     * @return double(реализация метода double getSquare() из интерфейса GeometricalFigure)
     */
    public double getSquare() {
        return a*b;
    }

    /**
     * @param obj
     * @return boolean(переопределение метода boolean equals() класса Object, чтобы сравнивать фигуры)
     */
    @Override
    public boolean equals(Object obj) {
        return this.a == ((Rectangle)obj).a && this.b == ((Rectangle)obj).b;
    }
}
