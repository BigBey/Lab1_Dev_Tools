//Тестовое редактирование
/**
 * Это класс Circle(круг), он реализует интерфейс GeometricalFigure и имеет поле r(радиус).
 */
public class Circle implements GeometricalFigure {
    private double r;

    /**
     * @return double(радиус фигуры)
     */
    public double getR() {
        return r;
    }

    /**
     * @param r
     * конструктор
     */
    public Circle(double r) {
        this.r = r;
    }

    /**
     * @return double(реализация метода double getPerimeter() из интерфейса GeometricalFigure)
     */
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    /**
     * @return double(реализация метода double getSquare() из интерфейса GeometricalFigure)
     */
    public double getSquare() {
        return Math.PI*r*r;
    }

    /**
     * @param obj
     * @return boolean(переопределение метода boolean equals() класса Object, чтобы сравнивать фигуры
     */
    @Override
    public boolean equals(Object obj) {
        return this.r == ((Circle)obj).r;
    }
}
