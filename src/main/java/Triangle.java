/**
 * Это класс Triangle(треугольник), он реализует интерфейс GeometricalFigure.
 * Имеет поля a,b,c типа double - соответственно стороны треугольника.
 */
public class Triangle implements GeometricalFigure, InscribedCircle {
    private double a;
    private double b;
    private double c;

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
     * @param a
     * @param b
     * @param c
     * Конструктор для всех полей класса
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return double(реализация метода double getPerimeter() из интерфейса GeometricalFigure)
     */
    public double getPerimeter() {
        return a+b+c;
    }

    /**
     * @return double(реализация метода double getSquare() из интерфейса GeometricalFigure)
     */
    public double getSquare() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    /**
     * @param obj
     * @return boolean(переопределение метода boolean equals() класса Object, чтобы сравнивать фигуры)
     */
    @Override
    public boolean equals(Object obj) {
        return this.a == ((Triangle)obj).a && this.b == ((Triangle)obj).b && this.c == ((Triangle)obj).c;
    }

    public double getROfInscribedCircle() {
        return getSquare()/(a+b+c);
    }
}
