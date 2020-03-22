import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getPerimeter() {
        Circle c = new Circle(5.5);
        double actual = c.getPerimeter();
        double expected = 2*Math.PI*c.getR();
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void getSquare() {
        Circle c = new Circle(5.5);
        double actual = c.getSquare();
        double expected = Math.PI*c.getR()*c.getR();
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void equals1() {
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(5.5);
        boolean actual = c1.equals(c2);
        boolean expected = c1.getR() == c2.getR();
        assertEquals(expected, actual);
    }
}