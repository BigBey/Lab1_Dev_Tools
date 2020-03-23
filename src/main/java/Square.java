/**
 * Это класс Square(квадрат), он реализует интерфейс GeometricalFigure и имеет поле a(сторона квадрата).
 */
public class Square implements GeometricalFigure, InscribedCircle {

    private double a;

    /**
     * @return double(геттер)
     */
    public double getA() {
        return a;
    }

    /**
     * @param a
     * конструктор
     */
    public Square(double a) {
        this.a = a;
    }

    /**
     * @return double(реализация метода double getPerimeter() из интерфейса GeometricalFigure)
     */
    public double getPerimeter() {
        return 4*a;
    }

    /**
     * @return double(реализация метода double getSquare() из интерфейса GeometricalFigure)
     */
    public double getSquare() {
        return a*a;
    }

    /**
     * @param obj
     * @return boolean(переопределение метода boolean equals() класса Object, чтобы сравнивать фигуры
     */
    @Override
    public boolean equals(Object obj) {
        return this.a == ((Square)obj).a;
    }

    public double getROfInscribedCircle() {
        return a;
    }
}
